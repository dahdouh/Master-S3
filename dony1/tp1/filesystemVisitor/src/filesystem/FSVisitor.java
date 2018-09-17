/**
 * 
 */
package filesystem;

public abstract class FSVisitor {
	abstract public void FileVisitor(File f);
	abstract public void RegularDirectoryVisitor(RegularDirectory rd);
	abstract public void RootVisitor(Root r);
}
