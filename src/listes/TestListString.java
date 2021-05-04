package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		List<String> liste = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
//		Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		int taille =0;
		String result="";
		for (String i : liste) {
			if (i.length()>taille) {
				taille=i.length();
				result = i;
			}
		}
		System.out.println(result);
		
		
//		Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
//		majuscules.
		
		for (int i = 0; i< liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		
//		Supprimez de la liste les villes dont le nom commence par la lettre N.
		for (int i =0; i<liste.size();i++) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}
		
		
		
		for (String i: liste) {
			System.out.println(i);
		}
		
	}

}
