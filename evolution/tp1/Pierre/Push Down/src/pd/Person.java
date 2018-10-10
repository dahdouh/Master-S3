package pd;

public class Person {
	
	protected int skill; //n'augmente qu'en étudiant mais est utile par contre pour le travail

	public Person(){
	
	}
	
	public boolean getJob() {
		if(skill>2) {
			return true;
		}
		else {
			return false;
		}
	}
    
    	public void Etudier() {
		skill++;
	}
	
}
