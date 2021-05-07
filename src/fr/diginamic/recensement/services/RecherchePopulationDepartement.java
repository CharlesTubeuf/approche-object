package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, String departementChoisi) {
		int sommePopulation = 0; 
		for (Ville ville : recensement.getListeVille()) {
			if (departementChoisi.equalsIgnoreCase(ville.getCodeDepartement())){
				sommePopulation += ville.getPopulationTotal();
			}
		}
		if(sommePopulation == 0) {
			System.out.println("Nous n'avons pas trouvé de département avec ce code...");
		}	
		else {
			System.out.println("La population du département "+ departementChoisi + " est de " + sommePopulation + " habitants. \n");
		}

	}

}
