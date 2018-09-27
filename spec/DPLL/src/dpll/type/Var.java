package dpll.type;

public class Var extends Atome {
	private String symb;
	
	public Var(String s) {
		this.symb=s;
	}
	
	public String getSymb() {
		return symb;
	}

	@Override
	public boolean isVar() {
		return true;
	}
}
