package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		Path pathFile = Paths.get("C:/Users/Administrateur/Desktop/documents/Diginamic/Cours/Java 11/Workspace/approche-objet/src/recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
//		Lire le contenu du fichier
		
		for( String line : lines) {
			System.out.println(line);
		}
		
//		Générez un fichier cible :
//			o au format CSV (séparateur ; )
//			o ne contenant que les villes de plus de 25000 habitants
//			o avec seulement 3 informations : le nom de la ville, le code département et la
//			population totale.
		
		List<String> nouveau = new ArrayList<>();
		String first = "Nom de la commune;Code département;Population totale;";
		nouveau.add(first);
		
		for( int i = 1; i < lines.size(); i++) {
			String[] tabLine = lines.get(i).split(";");

			int nbHabitants = Integer.parseInt(tabLine[9].trim().replaceAll(" ", ""));

			// Ajouter uniquement les colonnes et les lignes que l'on veut 
			if (nbHabitants > 25000) {
				String ecrire = tabLine[6]+";"+tabLine[2]+";"+tabLine[9]+";";
				nouveau.add(ecrire);
			}
	
		}

		Path pathCible = Paths.get("C:/Users/Administrateur/Desktop/documents/Diginamic/Cours/Java 11/Workspace/approche-objet/src/recensement(2).csv");
		Files.write(pathCible, nouveau);

	}

}
