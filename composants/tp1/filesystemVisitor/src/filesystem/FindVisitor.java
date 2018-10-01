package filesystem;

import java.util.ArrayList;

public class FindVisitor extends FSVisitor {
	private String FileNameToMatch; 
	private ArrayList<String> match;
		
	public FindVisitor(String FNTM) {
		this.FileNameToMatch=FNTM;
		this.match=new ArrayList<String>();
	}
	
	private void addFile(StorageElement se) {
		if(se.name==this.FileNameToMatch) {
			match.add(se.absoluteAddress());
		}		
	}
	
	@Override
	public void FileVisitor(File f) {
		addFile(f);
	}

	@Override
	public void RegularDirectoryVisitor(RegularDirectory rd) {
		addFile(rd);
	}

	@Override
	public void RootVisitor(Root r) {
		//root names shouldn't ever match, right?
	}

	public ArrayList<String> getMatch() {
		return match;
	}
}
