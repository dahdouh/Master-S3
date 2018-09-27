package dpll.type;

abstract class Atome extends Prop {

	@Override
	public String prettyPrint() {
		return this.getSymb();
	}

	@Override
	public boolean isAtome() {
		return true;
	}
}
