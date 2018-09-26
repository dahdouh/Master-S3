package item;

import java.lang.Math;

public class Symlink extends FilesystemItem {
	
	protected static final String NAME = "MySpecialName";
	protected int someProperty;
	private String content;
	
	public Symlink() {
		this.someProperty = 45781;
	}
	
	public double getSize(){
		return Math.random();
	}
	
	public String readName(){
		return this.NAME;
	}
	
	public void setContentAndSomeProperty(String content, int someProperty) {
		this.content = content;
		this.someProperty = someProperty;
	}
	
	public void someOtherMethod() {
	}
}