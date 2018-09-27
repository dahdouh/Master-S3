package dpll.type;

public class Or extends BinaryOperator {
	static public String symb=new String("\\/");
	
	public Or(Prop l,Prop r){
		super(l,r);
	}
	
	@Override
	public String getSymb() {
		return Or.symb;
	}
	
	@Override
	public boolean isOr() {
		return true;
	}
}
