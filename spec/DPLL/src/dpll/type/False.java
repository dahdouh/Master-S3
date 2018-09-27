package dpll.type;

public class False extends Constant {

	static String symb=new String("F");
			
	@Override
	public String getSymb() {
		return False.symb;
	}

	@Override
	public boolean isFalse() {
		return true;
	}
}
