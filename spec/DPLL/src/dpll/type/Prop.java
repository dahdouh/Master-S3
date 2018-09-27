package dpll.type;

public abstract class Prop {
	abstract public String prettyPrint();
	abstract public String getSymb();
	
	public boolean isOperator() {
		return false;
	}
	
	public boolean isAtome() {
		return false;
	}
	
	public boolean isVar() {
		return false;
	}

	public boolean isConstant() {
		return false;
	}
	
	public boolean isTrue() {
		return false;
	}
	
	public boolean isFalse() {
		return false;
	}

	public boolean isUnaryOperator() {
		return false;
	}
	
	public boolean isNot() {
		return false;
	}
	
	public boolean isBinaryOperator() {
		return false;
	}
	
	public boolean isAnd() {
		return false;
	}
	
	public boolean isOr() {
		return false;
	}
	
	public boolean isImply() {
		return false;
	}

	public boolean isEqual() {
		return false;
	}
}
