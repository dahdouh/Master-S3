package filesystem;

public class RegularDirectory extends Directory {
	
	public RegularDirectory(String name,Directory daddy){
		super(name,daddy);
	}
	 
	@Override
	protected void accept(FSVisitor fsv) 
	{
		super.accept(fsv);
		fsv.RegularDirectoryVisitor(this);
	}
	
	@Override
	public String absoluteAddress() {
		return new String(Daddy.absoluteAddress()+name+"\\");
	}
	
	@Override
	public void delete() {
		super.delete();//delete the sons
		Daddy.IDiedDaddy(this);
	}
}
