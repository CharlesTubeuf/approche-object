package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("Balart", 500, 212, 1418.6);

		theatre.inscrire(123, 5.50);
		System.out.println(theatre);
		theatre.inscrire(350, 5.50);
		System.out.println(theatre);
		
	}

}
