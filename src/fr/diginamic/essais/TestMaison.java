package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison chateau = new Maison ();
		
		Salon salon = new Salon(25,0);
		Cuisine cuisine = new Cuisine(6,0);
		Chambre chambre = new Chambre(15,1);
		SalleDeBain salleDeBain = new SalleDeBain(7,1);
		SalleDeBain sdb = new SalleDeBain(10,0);
		
		chateau.ajouterPiece(salon);
		chateau.ajouterPiece(cuisine);
		chateau.ajouterPiece(chambre);
		chateau.ajouterPiece(salleDeBain);
		chateau.ajouterPiece(sdb);
		chateau.ajouterPiece(null);
		
		System.out.println( chateau.superficieTotal());
		System.out.println(chateau.superficieEtage(0));
		System.out.println(chateau.SuperficieParTypeDePiece("salledebain"));
		System.out.println(chateau.nombreDePieceDuType("CHAMBRE"));
		
	}

}
