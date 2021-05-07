package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, String villeChoisi) {
		boolean trouver = false;
		for (Ville ville : recensement.getListeVille()) {
			if (villeChoisi.equalsIgnoreCase(ville.getNomCommune())){
				System.out.println("La population de "+ ville.getNomCommune() + " est de " + ville.getPopulationTotal() + " habitants. \n");
				trouver = true;
			}
		}
		if(trouver == false) {
			System.out.println("Nous n'avons pas trouvé de ville à ce nom.... \n");
		}	
	}

}
