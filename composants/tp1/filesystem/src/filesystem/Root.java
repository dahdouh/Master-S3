package filesystem;

public abstract class Root extends Directory {

	public Root() {
		super("/",null);
	}

	@Override
	public String absoluteAddress() {
		return this.name;
	}

}
