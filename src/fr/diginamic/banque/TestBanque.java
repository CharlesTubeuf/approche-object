package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte a = new Compte(1,189);
		CompteTaux b = new CompteTaux(2,150, 2);
		Compte [] tabCompte = {a, b};
		
		for (int i = 0; i< tabCompte.length; i++) {
			System.out.println(tabCompte[i]);
		}
		
	}

}
