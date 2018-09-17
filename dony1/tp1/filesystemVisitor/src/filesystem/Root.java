package filesystem;

public abstract class Root extends Directory {

	
	
	public Root() {
		super("/",null);
	}

	@Override
	protected void accept(FSVisitor fsv) 
	{
		super.accept(fsv);
		fsv.RootVisitor(this);
	}
		
	@Override
	public void delete() {
		super.delete();//delete son's
		System.out.println("deleting the root, are you insane?");//several ways to handle this, doesn't matter
	}
	
	@Override
	public String absoluteAddress() {
		return this.name;
	}
	
}
