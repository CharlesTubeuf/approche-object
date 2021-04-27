package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressePostale a1 = new AddressePostale();
		a1.numéroDeRue = 5;
		a1.libelléDeRue = "rue du général de gaule" ;
		a1.codePostal = 95530;
		a1.ville = "La frette sur seine";
		
		AddressePostale a2 = new AddressePostale();
		a2.numéroDeRue = 54;
		a2.libelléDeRue = "rue Leclerc" ;
		a2.codePostal = 94140;
		a2.ville = "Alfortville";
		
		Personne perso1 = new Personne();
		perso1.nom ="titi";
		perso1.prénom = "wistiti";
		perso1.addresse = a1;
		
		Personne perso2 = new Personne();
		perso2.nom ="toto";
		perso2.prénom = "trocosto";
		perso2.addresse = a2;
		
		
	}

}
