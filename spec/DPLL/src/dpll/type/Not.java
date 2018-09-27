package dpll.type;

public class Not extends UnaryOperator {
	public static String symb=new String("!");
	
	public Not(Prop p) {
		super(p);
	}
		
	@Override
	public String getSymb() {
		return Not.symb;
	}
	
	@Override
	public boolean isNot() {
		return true;
	}

}
