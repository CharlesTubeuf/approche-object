package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);

		List<Ville> liste = new ArrayList<>(
				Arrays.asList(nice, carcassonne, narbonne, lyon, foix, pau, marseille, tarbes));

//		Recherchez et affichez la ville la plus peuplée
		int populationMax = 0;
		int index=0;
		for (int i = 0; i < liste.size(); i++) {
			if (populationMax < liste.get(i).getNbHabitants()) {
				populationMax = liste.get(i).getNbHabitants();
				index = i;
			}
		}
		System.out.println("La ville la plus peuplée est : " + liste.get(index).getNom());
		
		
//		Supprimez la ville la moins peuplée
		
		int populationMin =liste.get(0).getNbHabitants();
		index=0;
		for (int i = 0; i < liste.size(); i++) {
			if (populationMin > liste.get(i).getNbHabitants()) {
				populationMin = liste.get(i).getNbHabitants();
				index = i;
			}
		}
		liste.remove(index);
		
		
//		Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		Iterator<Ville> iter = liste.iterator();
		while(iter.hasNext()) {
			Ville ville = iter.next();
			if (ville.getNbHabitants()>100000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
//		Affichez enfin la liste résultante
		for (Ville ville : liste) {
			System.out.println(ville);
		}
		
		

	}

}
