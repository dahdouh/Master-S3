package dpll.type;

public class Equal extends BinaryOperator {
	static public String symb=new String("<=>");
	
	public Equal(Prop l,Prop r){
		super(l,r);
	}
	
	@Override
	public String getSymb() {
		return Equal.symb;
	}
}
