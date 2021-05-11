package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Réalisez une boucle qui affiche l’ensemble des villes avec leur continent
//		respectif
		
		Ville nice = new Ville("Nice", 343000,Continent.EUROPE);
		Ville carcassonne = new Ville("Carcassonne", 47800,Continent.EUROPE);
		Ville narbonne = new Ville("Narbonne", 53400,Continent.EUROPE);
		Ville lyon = new Ville("Lyon", 484000,Continent.EUROPE);
		Ville foix = new Ville("Foix", 9700,Continent.EUROPE);
		Ville pau = new Ville("Pau", 77200,Continent.EUROPE);
		Ville marseille = new Ville("Marseille", 850700,Continent.EUROPE);
		Ville tarbes = new Ville("Tarbes", 40600,Continent.EUROPE);

		List<Ville> liste = new ArrayList<>(
				Arrays.asList(nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes));
		
		for (Ville ville : liste) {
			System.out.println(ville);
		}
		
	}

}
