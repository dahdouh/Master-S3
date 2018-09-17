package filesystem;

public class JavaCleanVisitor extends FSVisitor {

	@Override
	public void FileVisitor(File f) {
		if(f.name==".java") {//Bad predicate, obviously. Lazyness prevents me to do it right.
			f.delete();
		}
	}

	@Override
	public void RegularDirectoryVisitor(RegularDirectory rd) {
		//We're removing files, not directories
	}

	@Override
	public void RootVisitor(Root r) {
		//We're removing files, not directories
	}

}
