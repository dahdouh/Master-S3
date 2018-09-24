package refactorMT;

import java.util.ArrayList;

public class Voiture {
	
	ArrayList<Roue> roues= new ArrayList<Roue>();

    class Roue {

       String brand;

       Roue(String brand){
    	   this.brand=brand;
       }
    }
    
    Voiture(){
    	int i=0;
    	while(i<4){
    		if(roues.size()<4){
    			Roue r = new Roue("Goodyear");
    			roues.add(r);
    		}
    	}
    }

    /**
     * Refactor: que la classe roue soit sortie de l'imbrication avec voiture (remise au même niveau) 
     */
    
    public static void main(String... args) {
        Voiture v = new Voiture();
    }
}