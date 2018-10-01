package pd;

public class Person {
	public boolean IsStudent;
	
	public Person(boolean isStudent){
		this.IsStudent=isStudent;
	}
	
	public void doStuff(){
		if(this.IsStudent){
			//Do some stuffs
		}
		else{
			//Do some other stuffs
		}
	}
	
}
