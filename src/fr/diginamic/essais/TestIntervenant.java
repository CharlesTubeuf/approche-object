package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie = new Salarie("charles", "tubeuf",1555.89);
		System.out.println(salarie.getSalaire());
		Pigiste pigiste = new Pigiste("Richard", "Poustoi",8, 300);
	 	System.out.println(pigiste.getSalaire());
	 	pigiste.afficherDonnes();
	 	salarie.afficherDonnes();
	 	
	}

}
