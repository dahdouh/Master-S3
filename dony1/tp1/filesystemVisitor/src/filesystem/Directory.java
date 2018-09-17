package filesystem;

import java.util.ArrayList;

public abstract class Directory extends StorageElement {
	protected ArrayList<StorageElement> MyBabies;
	
	public Directory(String name,Directory Daddy){
		super(name,Daddy);
		this.MyBabies=new ArrayList<StorageElement>();
	}

	protected void YouAreMyDaddy(StorageElement e){
		MyBabies.add(e);
	}
	
	@Override
	protected void accept(FSVisitor fsv) {
		for(StorageElement Baby : MyBabies) {
			Baby.accept(fsv);
		}
	}
	
	@Override
	public int size() {
		int s=this.getBasicSize();
		for(StorageElement Baby : MyBabies){
			s+=Baby.size();
		}
		return s;
	}

	@Override
	public void ls() {
		for(StorageElement Baby : MyBabies){
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
	
	protected void IDiedDaddy(StorageElement se) {
		MyBabies.remove(se);
	}
	
	@Override
	public void delete() {//Delete the sons, specialisation takes care of each case
		for(StorageElement Baby : MyBabies) {
			Baby.delete();
		}
	}
	
}
