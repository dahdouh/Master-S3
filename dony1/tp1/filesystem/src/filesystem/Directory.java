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
}
