/**
 * 
 */
package filesystem;

public class RazVisitor extends FSVisitor {

	@Override
	public void FileVisitor(File f) {
		f.Content=null;
	}

	@Override
	public void RegularDirectoryVisitor(RegularDirectory rd) {
		//Nothing to do
	}

	@Override
	public void RootVisitor(Root r) {
		//nothing to do
	}

}
