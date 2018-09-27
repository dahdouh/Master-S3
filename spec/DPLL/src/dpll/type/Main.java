package dpll.type;

public class Main {

	public static void main(String[] args) {
		Prop p=new Imply(new Var("A"),new Var("B"));
		System.out.println(p.prettyPrint());
		
		p=new Equal(
				new Imply(
						new Not(
								new False()
								),
						new And(
								new True()
								,new Var("A")
								)
						),
				new Or(
						new Var("B"),
						new Var("A")));
		System.out.println(p.prettyPrint());
	}

}
