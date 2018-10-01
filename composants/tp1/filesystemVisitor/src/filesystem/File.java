package filesystem;

public class File extends StorageElement {
	/*Attributes*/
	protected String Content;
	
	/*Methods*/
	public File(String name,Directory daddy) {
		super(name,daddy);
		this.Content=new String();
	}
	
	protected void accept(FSVisitor fsv) 
	{
		fsv.FileVisitor(this);
	}
	
	@Override
	public int size() {
		return Content.length();
	}

	@Override
	public String absoluteAddress() {
		return Daddy.absoluteAddress()+this.name;
	}

	@Override
	public void ls() {
		System.out.println(this.name);
	}

	@Override
	public int nbElem(){
		return Content.length();
	}
		
	public void Cat(){
		System.out.println(this.Content);
	}
	
	public void setContents(String NewContent){
		this.Content=NewContent;
	}
	
	@Override
	public void delete() {
		Daddy.IDiedDaddy(this);
	}
	
	@Override
	protected int getBasicSize() {
		return 0;
	}
}
