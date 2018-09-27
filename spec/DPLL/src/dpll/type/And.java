package dpll.type;

public class And extends BinaryOperator {
	static public String symb=new String("/\\");
	
	public And(Prop l,Prop r){
		super(l,r);
	}
	
	@Override
	public String getSymb() {
		return And.symb;
	}
	
	@Override
	public boolean isAnd() {
		return true;
	}
}
