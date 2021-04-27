package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressePostale a1 = new AddressePostale(5, "rue de machin", 95550, "Belleville");

		AddressePostale a2 = new AddressePostale(54, "rue leclerc", 94561, "alfortville");
		
		Personne perso1 = new Personne("titi", "wistiti", a1);
	
		Personne perso2 = new Personne("toto","trocosto",a2);
		
	}

}
