package test;

import org.eclipse.emf.ecore.MemoClass;

import world2.Person;
import world2.World2Factory;

public class main {

	public static void main(String[] args) {
		Person person = World2Factory.eINSTANCE.createPerson();
		person.setName("Person1");;
		World2Factory.eINSTANCE.createPerson().setName("Person2");
		World2Factory.eINSTANCE.createPerson().setName("Person3");
		
		MemoClass memoclass=(MemoClass)person.eClass();
		for (Object o : memoclass.getInstance()){
			System.out.println(o);
		}
		System.out.println("done");
		
	}

}
