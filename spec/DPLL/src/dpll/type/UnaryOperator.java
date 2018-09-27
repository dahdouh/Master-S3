package dpll.type;

public abstract class UnaryOperator extends Operator{
	private Prop p;
	
	public UnaryOperator(Prop p) {
		this.p=p;
	}
	
	public Prop getProp(){
		return this.p;
	}
	
	@Override
	public String prettyPrint() {
		String temp=new String(this.getSymb());
		if( ! p.isAtome()) { temp+="(";}
		temp+=p.prettyPrint();
		if( ! p.isAtome()) { temp+=")";}
		return temp;
	}
	
	@Override
	public boolean isUnaryOperator() {
		return true;
	}

}
