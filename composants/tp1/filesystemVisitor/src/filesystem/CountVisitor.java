package filesystem;

public class CountVisitor extends FSVisitor {
	private int count;
	
	public CountVisitor(){
		this.count=0;
	}
	
	@Override
	public void FileVisitor(File f) {
		this.count++;//One file is in the directory
	}

	@Override
	public void RegularDirectoryVisitor(RegularDirectory rd) {
		//nothing to do
	}

	@Override
	public void RootVisitor(Root r) {
		//Nothing to do
	}

	public int getCount() {
		return this.count;
	}
}
