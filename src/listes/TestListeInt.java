package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		// Affichez tous les éléments de la liste

		for (Integer i : liste) {
			System.out.println(i);
		}

//		Affichez la taille de la liste
		System.out.println(liste.size());

//		Recherchez et affichez le plus grand élément de la liste
		int max = liste.get(0);
		for (Integer i : liste) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);

//		Supprimez le plus petit élément de la liste et affichez le résultat
		int min = liste.get(0);
		for (Integer i : liste) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("Le plus petit element était : " + min);
		int toSup = liste.indexOf(min);
		liste.remove(toSup);

//		Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent
//		positifs.

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, -(liste.get(i))) ;
			}
		}
//		Affichez enfin la liste résultante
		
		for (Integer i : liste) {
			System.out.println(i);
		}

	}

}
