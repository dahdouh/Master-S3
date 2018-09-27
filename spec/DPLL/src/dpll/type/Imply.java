package dpll.type;

public class Imply extends BinaryOperator {
	static public String symb=new String("=>");
	
	public Imply(Prop l,Prop r){
		super(l,r);
	}
	
	@Override
	public String getSymb() {
		return Imply.symb;
	}
	
	@Override
	public boolean isImply() {
		return true;
	}
}
