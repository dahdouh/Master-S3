package SourceAnalyser;

import org.eclipse.jdt.core.dom.ASTVisitor;

public class CallGraphVisitor extends ASTVisitor {

	public CallGraphVisitor() {
		super();
	}

	public CallGraphVisitor(boolean visitDocTags) {
		super(visitDocTags);
		// TODO Auto-generated constructor stub
	}

}
