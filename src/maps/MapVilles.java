package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Ville> mapVille = new HashMap<>();
        
		Ville nice = new Ville("Nice", 343000);
		Ville carcassonne = new Ville("Carcassonne", 47800);
		Ville narbonne = new Ville("Narbonne", 53400);
		Ville lyon = new Ville("Lyon", 484000);
		Ville foix = new Ville("Foix", 9700);
		Ville pau = new Ville("Pau", 77200);
		Ville marseille = new Ville("Marseille", 850700);
		Ville tarbes = new Ville("Tarbes", 40600);
		
		mapVille.put(nice.getNom(), nice);
		mapVille.put(carcassonne.getNom(), carcassonne);
		mapVille.put(narbonne.getNom(), narbonne);
		mapVille.put(lyon.getNom(), lyon);
		mapVille.put(foix.getNom(), foix);
		mapVille.put(pau.getNom(), pau);
		mapVille.put(marseille.getNom(), marseille);
		mapVille.put(tarbes.getNom(), tarbes);
		
//		Recherchez et supprimez la ville qui a le moins d’habitants
		
		int nbHabitantMin = Integer.MAX_VALUE;
		String keyVilleMin ="";
		Iterator<String> iterKey = mapVille.keySet().iterator();
		while(iterKey.hasNext()) {
			Ville ville = mapVille.get(iterKey.next());
			if(ville.getNbHabitants()<nbHabitantMin) {
				nbHabitantMin = ville.getNbHabitants();
				keyVilleMin = ville.getNom();
			}
		}
		mapVille.remove(keyVilleMin);
		
		iterKey = mapVille.keySet().iterator();
		System.out.println("afficher l'ensemble des villes restantes :");
		while(iterKey.hasNext()) {
			Ville ville = mapVille.get(iterKey.next());
			System.out.println(ville);
		}
		
		
		
		
		
	}

}
