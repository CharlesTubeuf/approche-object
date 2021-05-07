package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
	private List<Ville> listeVille;
	
	
	public Recensement() throws IOException{
		
		listeVille = init();
		
	}
	
	public List<Ville> init () throws IOException{
		
		Path pathFile = Paths.get("C:/Users/Administrateur/Desktop/documents/Diginamic/Cours/Java 11/Workspace/approche-objet/src/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);		
		
		List<Ville> listeVille = new ArrayList<>();
		
		for (int i = 1; i < lines.size(); i++) {
			
			String[] tabLine = lines.get(i).split(";");
			int codeRegion = Integer.parseInt(tabLine[0].trim().replaceAll(" ", ""));
			String nomRegion = tabLine[1];
			String codeDepartement = tabLine[2];
			int codeCommune = Integer.parseInt(tabLine[5].trim().replaceAll(" ", ""));
			String nomCommune = tabLine[6];
			int populationTotal = Integer.parseInt(tabLine[9].trim().replaceAll(" ", ""));;
			
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotal);
			listeVille.add(ville);
		}			
		return listeVille;	
	}

	public List<Ville> getListeVille() {
		return listeVille;
	}

	public void setListeVille(List<Ville> listeVille) {
		this.listeVille = listeVille;
	}
	
	
	
}
