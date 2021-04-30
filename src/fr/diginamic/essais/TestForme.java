package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Carre carre = new Carre( 10);
		Cercle cercle = new Cercle( 3);
		Rectangle rectangle = new Rectangle( 10, 5);
		
		AffichageForme.afficher(carre);
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rectangle);
	}

}
