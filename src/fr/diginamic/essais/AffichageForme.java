package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("le périmètre est : " + forme.calculerPerimetre() + " et la surface est : " + forme.calculerSurface() );
	}
	
}
