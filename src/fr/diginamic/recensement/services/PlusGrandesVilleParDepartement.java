package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class PlusGrandesVilleParDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, String departementChoisi) {
		
		List<Ville> listeVille = recensement.getListeVille();
		List<Ville> villesDepartement = new ArrayList<>();
		
		Iterator<Ville> iter = listeVille.iterator();
        while (iter.hasNext()){
        	Ville ville = iter.next();
        	if (ville.getCodeDepartement().equals(departementChoisi)) {
        		villesDepartement.add(ville);
        	}
        }
		
        for (int i = 1; i < 11 ; i++) {
        	int max =0; 
        	Ville laPlusPeuple = null;
        	for (int a= 0 ; a < villesDepartement.size() ; a++) {       		
        			if(villesDepartement.get(a).getPopulationTotal()>max) {
        				laPlusPeuple = villesDepartement.get(a); 
        				max = villesDepartement.get(a).getPopulationTotal();
        			}       		        		
        	}
        	System.out.println(i+"- Ville-"+departementChoisi+" : "+ laPlusPeuple.getNomCommune() + " avec : "+max+" habitants.");
        	villesDepartement.remove(laPlusPeuple);
        }
        System.out.println();
		
	}

}
