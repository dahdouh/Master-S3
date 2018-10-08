package item;

public class File extends FilesystemItem implements fsi
{
	protected String content ;
	protected int size ;
	protected String name;
	
	public File(String nom) {
		this.content = "";
		this.setSize(this.content.length());
	}
	
	/* (non-Javadoc)
	 * @see item.fsi#getSize()
	 */
	@Override
	public int getSize(){
		return this.size;
	}
	
	protected void setSize(int size){
		this.size = size;
	}
	
	/* (non-Javadoc)
	 * @see item.fsi#getName()
	 */
	@Override
	public String getName(){
		return this.name;
	}
	
	/* (non-Javadoc)
	 * @see item.fsi#setContent(java.lang.String)
	 */
	@Override
	public void setContent(String content) {
		this.content = content;
	}
	
	/* (non-Javadoc)
	 * @see item.fsi#someOtherMethod()
	 */
	@Override
	public void someOtherMethod() {
	}
	
}