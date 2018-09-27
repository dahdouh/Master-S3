package dpll.type;

public class True extends Constant {

	static String symb=new String("T");
			
	@Override
	public String getSymb() {
		return True.symb;
	}
	
	@Override
	public boolean isTrue() {
		return true;
	}

}
