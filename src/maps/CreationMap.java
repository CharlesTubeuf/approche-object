package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Paul – 1750 €
//		• Hicham – 1825 €
//		• Yu – 2250 €
//		• Ingrid – 2015 €
//		• Chantal – 2418 €
		
		HashMap<String,Integer> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul",1750);
		mapSalaires.put("Hicham",1825);
		mapSalaires.put("Yu",2250);
		mapSalaires.put("Ingrid",2015);
		mapSalaires.put("Chantal",2418);	
		
//		Une fois la map créée, affichez sa taille
	
		System.out.println(mapSalaires.size());
		System.out.println("-----------------------");
	
		
//		Exercice 2
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		
//		Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
//		Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		
		Iterator<Integer> iterKey = mapVilles.keySet().iterator();
		while(iterKey.hasNext()) {
			System.out.println(iterKey.next());
		}
		System.out.println("-----------------------");
		
		
//		Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		
		Iterator<String> iterValue = mapVilles.values().iterator();
		while(iterValue.hasNext()) {
			System.out.println(iterValue.next());
		}
		System.out.println("-----------------------");
		
//		Afficher la taille de la map
		
		System.out.println(mapVilles.size());
		System.out.println("-----------------------");
		
		
	}
	

}
