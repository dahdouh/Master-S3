package memo;
import memo.MemoFactory;
import memo.impl.MemoFactoryImpl;

public class Main {
	public static void main(String[] args) {
		World w=MemoFactory.eINSTANCE.createWorld();
		
		Automobile a= MemoFactory.eINSTANCE.createAutomobile();
		a.setType(AutomobileType.MERCEDES);
		a.setName("Class C");
		w.getAutomobiles().add(a);
		
		Person p=MemoFactory.eINSTANCE.createPerson();
		p.setName("Christophe");
		p.setAge(45);
		p.getHas().add(a);
		w.getPopulation().add(p);
		
		System.out.println(p.getAge());
		p.birthday();
		System.out.println(p.getAge());
	}
}
