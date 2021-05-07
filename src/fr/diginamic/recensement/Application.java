package fr.diginamic.recensement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.services.PlusGrandesVilleParDepartement;
import fr.diginamic.recensement.services.PlusGrandesVilleParRegion;
import fr.diginamic.recensement.services.PlusGrandesVillesDeFrance;
import fr.diginamic.recensement.services.Recherche10DepartementMaxPopulation;
import fr.diginamic.recensement.services.Recherche10RegionMaxPopulation;
import fr.diginamic.recensement.services.RecherchePopulationDepartement;
import fr.diginamic.recensement.services.RecherchePopulationRegion;
import fr.diginamic.recensement.services.RecherchePopulationVille;

public class Application  {

	public static void main(String[] args) throws IOException{
		
		Recensement r = new Recensement();	
		boolean sortir = false;
		
		while ( sortir == false) {
			
			System.out.println("                 Veuillez sélectionner une option : \n"
					+ "                 - 1. Population d’une ville donnée \n"
					+ "                 - 2. Population d’un département donné \n"
					+ "                 - 3. Population d’une région donnée \n"
					+ "                 - 4. Afficher les 10 régions les plus peuplées \n"
					+ "                 - 5. Afficher les 10 départements les plus peuplés \n"
					+ "                 - 6. Afficher les 10 villes les plus peuplées d’un département \n"
					+ "                 - 7. Afficher les 10 villes les plus peuplées d’une région \n"
					+ "                 - 8. Afficher les 10 villes les plus peuplées de France \n"
					+ "                 - 9. Sortir");
			Scanner scanner = new Scanner(System.in);
			int choix = Integer.parseInt(scanner.next());
			
			switch (choix) {
			
			case 1 :
				System.out.println("Veuillez renseigner la ville dont vous voulez connaitre la population : ");
				String ville = scanner.next();
				RecherchePopulationVille recherchePopulationVille = new RecherchePopulationVille();
				recherchePopulationVille.traiter(r,ville);
				break;
				
			case 2 :
				System.out.println("Veuillez renseigner le département (exemple : 01) dont vous voulez connaitre la population : ");
				String departement = scanner.next();
				RecherchePopulationDepartement recherchePopulationDepartement = new RecherchePopulationDepartement();
				recherchePopulationDepartement.traiter(r,departement);
				break;
				
			case 3 :
				System.out.println("Veuillez renseigner le code (exemple : 28) ou le nom (exemple : Normandie) de la région dont vous voulez connaitre la population : ");
				String region = scanner.next();
				RecherchePopulationRegion recherchePopulationRegion = new RecherchePopulationRegion();
				recherchePopulationRegion.traiter(r,region);
				break;
			case 4 :
				System.out.println("La liste des 10 régions les plus peuplées : ");
				Recherche10RegionMaxPopulation recherche10RegionMaxPopulation = new Recherche10RegionMaxPopulation();
				recherche10RegionMaxPopulation.traiter(r,null);
				break;
			case 5 :
				System.out.println("Voici les 10 département les plus peuplés ");
				Recherche10DepartementMaxPopulation recherche10DepartementMaxPopulation = new Recherche10DepartementMaxPopulation();
				recherche10DepartementMaxPopulation.traiter(r,null);
				break;
			case 6 :
				System.out.println("Veuillez renseigner le code de département dont vous souhaitez connaitre les plus grandes villes : ");
				departement = scanner.next();
				PlusGrandesVilleParDepartement plusGrandesVilleParDepartement = new PlusGrandesVilleParDepartement();
				plusGrandesVilleParDepartement.traiter(r,departement);
				break;
			case 7 :
				System.out.println("Veuillez renseigner le code (exemple : 28) ou le nom (exemple : Normandie) de la région dont vous voulez connaitre lles plus grandes villes : ");
				region = scanner.next();
				PlusGrandesVilleParRegion plusGrandesVilleParRegion = new PlusGrandesVilleParRegion();
				plusGrandesVilleParRegion.traiter(r,region);
				break;
			case 8 :
				System.out.println("Voici les 10 villes les plus peuplées de France : ");
				PlusGrandesVillesDeFrance plusGrandesVillesDeFrance = new PlusGrandesVillesDeFrance();
				plusGrandesVillesDeFrance.traiter(r,null);
				break;
			case 9 :
				sortir = true;
				System.out.println("Vous avez arrêté le programme !");
				break;
			default :
				System.out.println("Vous n'avez pas renseigner une valeur entre 1 et 9");
				break;
			}
			
		}
		
	
	}

}
