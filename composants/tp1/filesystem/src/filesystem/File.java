package filesystem;

public class File extends StorageElement {
	/*Attributes*/
	protected String Content;
	
	/*Methods*/
	public File(String name,Directory daddy) {
		super(name,daddy);
		this.Content=new String();
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
	
	@Override
	protected int getBasicSize() {
		return 0;
	}
	
	
	public void Cat(){
		System.out.println(this.Content);
	}
	
	public void setContents(String NewContent){
		this.Content=NewContent;
	}

}
