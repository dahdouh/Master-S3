package master;

import java.util.*;

public class Etudiant {
	
	// attribut à encapsuler
	public Parcours parcours;
	
	public Etudiant() {
		this.parcours = new Parcours();
	}
	
	public void inscription(String ue) {
		this.parcours.ues.add("HHMIN357");
		this.parcours.ues.add("HHMIN358");	
		this.parcours.ues.add("HHMIN359");	
		this.parcours.ues.add(ue);	
	}
}
