package fr.diginamic.recensement.services;

import java.util.List;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class PlusGrandesVillesDeFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, String villeChoisi) {

		List<Ville> listeVille = recensement.getListeVille();
		for (int i = 1; i < 11 ; i++) {
        	int max =0; 
        	Ville laPlusPeuple = null;
        	for (int a= 0 ; a < listeVille.size() ; a++) {       		
        			if(listeVille.get(a).getPopulationTotal()>max) {
        				laPlusPeuple = listeVille.get(a); 
        				max = listeVille.get(a).getPopulationTotal();
        				System.out.println("BUUUUGGGGG");
        			}       		        		
        	}
        	System.out.println(i+"- Ville de France :-"+listeVille+" : "+ laPlusPeuple.getNomCommune() + " avec : "+max+" habitants.");
        	listeVille.remove(laPlusPeuple);
        }
        System.out.println();
	}
}
