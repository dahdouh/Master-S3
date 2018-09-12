package filesystem;

public class RegularDirectory extends Directory {
	
	public RegularDirectory(String name,Directory daddy){
		super(name,daddy);
	}
	
	@Override
	public String absoluteAddress() {
		return new String(Daddy.absoluteAddress()+name+"\\");
	}
}
