package SourceAnalyser;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.jdt.core.dom.ASTVisitor;

import SourceAnalyser.ClassComparator.comparaisonType;

import org.eclipse.jdt.core.dom.*;


public class AppliAST extends ASTVisitor{
	private ArrayList<TypeDeclaration> classAST;
	private ArrayList<TypeDeclaration> interfaceAST;
	private HashSet<String> imports;
	
	
	public AppliAST(){
		super();
		this.classAST = new ArrayList<>();
		this.interfaceAST = new ArrayList<>();
		this.imports = new HashSet<>();
	}
	
	
	@Override//classes déclarations
	public boolean visit(TypeDeclaration node) {
		if(node.isInterface()) {
			interfaceAST.add(node);
		}	
		else {
			classAST.add(node);
		}
		return true;
	}
	
	@Override
	public boolean visit(ImportDeclaration node) {
		imports.add(node.getName().toString());
		return true;
	}
	
	public int nbMethodTotal(){
		int cmpt=0;
		for(TypeDeclaration c: classAST) {
			cmpt+=c.getMethods().length;
		}
		return cmpt;
	}
	
	public ArrayList<TypeDeclaration> sortBy(comparaisonType type){
		ArrayList<TypeDeclaration> res=(ArrayList)classAST.clone();
		res.sort(new ClassComparator(type));
		return res;
	}
	
	//Taux must be a %
	public ArrayList<TypeDeclaration> restrain(int taux,comparaisonType type){
		ArrayList<TypeDeclaration> res=new ArrayList<>();
		ArrayList<TypeDeclaration> sorted=sortBy(type);
		for(int i=sorted.size()-1;i>=sorted.size()-(sorted.size()*taux)/100;i--) {//TOCHECK
			res.add(sorted.get(i));			
		}
		return res;
	}
	
	public ArrayList<TypeDeclaration> getPercentileSortByMethods(int taux){
		return restrain(taux,ClassComparator.comparaisonType.METHODS_NUMBER);
	}
	
	public ArrayList<TypeDeclaration> getPercentileSortByFields(int taux){
		return restrain(taux,ClassComparator.comparaisonType.FIELDS_NUMBER);
	}
	
	public String  getPercentileSortByFieldsAsString(int taux){
		return typeDeclarationToString(getPercentileSortByFields(taux));
	}
	
	public String getPercentileSortByMethodsAsString(int taux){
		return typeDeclarationToString(getPercentileSortByMethods(taux));
	}
	
	public String typeDeclarationToString(AbstractCollection<TypeDeclaration> collection) {
		String res="";
		for(TypeDeclaration i: collection){
			res+=" "+i.getName();
		}
		
		return res;
	}


	public ArrayList<TypeDeclaration> GetPercentileSortByFieldsAndMethods(int taux){
		ArrayList<TypeDeclaration> res=new ArrayList<>();
		
		ArrayList<TypeDeclaration> methods=getPercentileSortByMethods(taux);

		for(TypeDeclaration field: getPercentileSortByFields(taux)) {
			if(methods.contains(field)) {
				res.add(field);
			}
		}
		return res;
	}

	public String GetPercentileSortByFieldsAndMethodsAsString(int taux){
		return typeDeclarationToString(GetPercentileSortByFieldsAndMethods(taux));
	}
	
	public int nbFieldTotal(){
		int cmpt=0;
		for(TypeDeclaration c: classAST) {
			cmpt+=c.getFields().length;
		}
		return cmpt;
	}

	public int AverageFieldsByClass() {
		return nbFieldTotal()/nbClass();
	}
	
	public int AverageNbMethodByClass() {
		return nbMethodTotal()/nbClass();
	}
	
	//removing interfaces
	public int nbClass() {
		return classAST.size();
	}
		
	public ArrayList<TypeDeclaration> getClassAST() {
		return classAST;
	}

	public String getClassesNames() {
		
		String result="";
		for(TypeDeclaration c : classAST) {
			result=result+"\n"+c.getName();		
		}
		return result;
	}
	
	@Override
	public String toString(){
		return this.getClassesNames();
	}
	
	public int getNbOfUniqueImport() {
		return imports.size();
	}
}

abstract class a{
	
}

interface i{
	
}