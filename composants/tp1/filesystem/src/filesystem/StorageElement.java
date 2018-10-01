package filesystem;

public abstract class StorageElement {
	protected String name;
	protected int basicSize;
	protected Directory Daddy;
	
	public StorageElement(String name,Directory daddy){
		this.name=name;
		this.basicSize=getBasicSize();
		this.Daddy=daddy;
		this.Daddy.YouAreMyDaddy(this);
	}
	
	abstract public int size();
	abstract public String absoluteAddress();
	abstract public void ls();
	abstract public int nbElem();
	
	abstract protected int getBasicSize();
}
