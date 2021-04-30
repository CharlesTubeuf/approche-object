package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c2r = new Cercle(2);
		Cercle c3r = new Cercle(3);
		
		System.out.println("le périmètre du cercle de 2 de rayon est de "+ c2r.calculerPerimetre() +" et la surface est de "+ c2r.calculerSurface()+ " unité²");
		System.out.println("le périmètre du cercle de 3 de rayon est de "+ c3r.calculerPerimetre() +" et la surface est de "+ c3r.calculerSurface()+ " unité²");
		
		Cercle c4r = CercleFactory.createCercle(4);
		System.out.println(c4r);
	}

}
