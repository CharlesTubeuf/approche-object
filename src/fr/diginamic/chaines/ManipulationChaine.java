package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.salaire.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		
		chaine.charAt(0);
		chaine.length();
		chaine.indexOf(';');
		String nom = chaine.substring(0, chaine.indexOf(';'));
		System.out.println(nom);
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		String[] donnee = chaine.split(";");	
		
		Salarie durand = new Salarie(donnee[0],donnee[1], Double.parseDouble(donnee[2].replace(" ", "")));
		System.out.println(durand);
		
		
		
		
		
		
	}

}
