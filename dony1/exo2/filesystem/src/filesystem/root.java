package filesystem;

public abstract class root extends Directory {

	public root() {
		super("/",null);
	}

	@Override
	public String absoluteAddress() {
		return this.name;
	}

}
