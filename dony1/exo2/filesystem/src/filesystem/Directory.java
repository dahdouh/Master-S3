package filesystem;

import java.util.ArrayList;

public abstract class Directory extends ElementDeStockage {
	protected ArrayList<ElementDeStockage> MyBabies;
	
	public Directory(String name,Directory Daddy){
		super(name,Daddy);
		this.MyBabies=new ArrayList<ElementDeStockage>();
	}

	public void YouAreMyDaddy(ElementDeStockage e){
		MyBabies.add(e);
	}
	
	@Override
	public int size() {
		int s=this.getBasicSize();
		for(ElementDeStockage Baby : MyBabies){
			s+=Baby.size();
		}
		return s;
	}

	@Override
	public void ls() {
		for(ElementDeStockage Baby : MyBabies){
			System.out.println(Baby.name);
		}
	}

	@Override
	public int nbElem(){
		return MyBabies.size();
	}
	
	@Override
	protected int getBasicSize(){
		return 4;
	}
}
