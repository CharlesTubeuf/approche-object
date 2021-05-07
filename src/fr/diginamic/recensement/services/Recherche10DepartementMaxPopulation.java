package fr.diginamic.recensement.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class Recherche10DepartementMaxPopulation extends MenuService {

	@Override
	public void traiter(Recensement recensement, String villeChoisi) {
		// TODO Auto-generated method stub
List<Ville> listeVille = recensement.getListeVille();
		
		HashMap<String, Integer> regions = new HashMap<>();
		
		
		Iterator<Ville> iter = listeVille.iterator();
        while (iter.hasNext()){
            Ville ville = iter.next();
            if (regions.get(ville.getCodeDepartement()) == null) {
            	regions.put(ville.getCodeDepartement(), ville.getPopulationTotal());
            } else{
            	regions.put(ville.getCodeDepartement(), regions.get(ville.getCodeDepartement()) + ville.getPopulationTotal());
            }            
        }
        
        for (int i = 1; i < 11 ; i++) {
        	Iterator<String> iterator = regions.keySet().iterator();
        	int max =0; 
        	String laPlusPeuple ="";
        	while(iterator.hasNext()) {
        		String region = iterator.next();
        		if(regions.get(region)>max) {
        			laPlusPeuple = region; 
        			max = regions.get(region);
        		}       		
        	}
        	System.out.println(i+"- Département : "+ laPlusPeuple + " avec : "+max+" habitants.");
        	regions.remove(laPlusPeuple);
        }
        System.out.println();
	}

}
