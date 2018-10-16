package SourceAnalyser;

import java.util.ArrayList;
import java.util.HashSet;

import org.eclipse.jdt.core.dom.ASTVisitor;
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