package item;

public class File extends FilesystemItem
{
	protected String content ;
	protected int size ;
	protected String name;
	
	public File(String nom) {
		this.content = "";
		this.setSize(this.content.length());
	}
	
	public int getSize(){
		return this.size;
	}
	
	protected void setSize(int size){
		this.size = size;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void someOtherMethod() {
	}
	
}