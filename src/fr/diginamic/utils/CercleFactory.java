package fr.diginamic.utils;

import fr.diginamic.formes.Cercle;

public class CercleFactory {
	
	public static Cercle createCercle(double rayon) {
		Cercle cercle = new Cercle ( rayon);
		return cercle;
	}
	
}
