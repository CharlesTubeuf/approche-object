package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, String regionChoisi) {
		
		int sommePopulation = 0; 
		for (Ville ville : recensement.getListeVille()) {
			if (regionChoisi.equalsIgnoreCase(ville.getNomRegion()) || regionChoisi.equalsIgnoreCase(Integer.toString(ville.getCodeRegion()))){
				sommePopulation += ville.getPopulationTotal();
			}
		}
		if(sommePopulation == 0) {
			System.out.println("Nous n'avons pas trouvé de région avec ce code/nom...");
		}	
		else {
			System.out.println("La population total de la région "+ regionChoisi + " est de " + sommePopulation + " habitants. \n");
		}

	}

}
