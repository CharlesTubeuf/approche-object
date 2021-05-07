package fr.diginamic.recensement.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class PlusGrandesVilleParRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, String regionChoisi) {

		List<Ville> listeVille = recensement.getListeVille();
		List<Ville> villesRegion = new ArrayList<>();
		
		Iterator<Ville> iter = listeVille.iterator();
        while (iter.hasNext()){
        	Ville ville = iter.next();
        	if (regionChoisi.equalsIgnoreCase(ville.getNomRegion()) || regionChoisi.equalsIgnoreCase(Integer.toString(ville.getCodeRegion()))){
        		villesRegion.add(ville);
        	}
        }
		
        for (int i = 1; i < 11 ; i++) {
        	int max =0; 
        	Ville laPlusPeuple = null;
        	for (int a= 0 ; a < villesRegion.size() ; a++) {       		
        			if(villesRegion.get(a).getPopulationTotal()>max) {
        				laPlusPeuple = villesRegion.get(a); 
        				max = villesRegion.get(a).getPopulationTotal();
        			}       		        		
        	}
        	System.out.println(i+"- Ville-"+regionChoisi+" : "+ laPlusPeuple.getNomCommune() + " avec : "+max+" habitants.");
        	villesRegion.remove(laPlusPeuple);
        }
        System.out.println();

	}

}
