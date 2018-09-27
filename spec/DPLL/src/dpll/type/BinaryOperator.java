package dpll.type;

public abstract class BinaryOperator extends Operator {
	private Prop left;
	private Prop right;
	
	BinaryOperator(Prop l,Prop r){
		this.left=l;
		this.right=r;
	}
	
	@Override
	public String prettyPrint() {
		String temp=new String();
		
		if( ! left.isAtome()) { temp+="(";}
		temp+=left.prettyPrint();
		if( ! left.isAtome()) { temp+=")";}
		
		temp+=this.getSymb();
		
		if( ! right.isAtome()) { temp+="(";}
		temp+=right.prettyPrint();
		if( ! right.isAtome()) { temp+=")";}
		return temp;
	}
	
	@Override
	public boolean isBinaryOperator() {
		return true;
	}
}
