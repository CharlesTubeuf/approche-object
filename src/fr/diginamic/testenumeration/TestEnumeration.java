package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

//		Utilisez une boucle pour affichez toutes les saisons.
		Saison[] saisons = Saison.values();
		
		for (Saison i : saisons) {
			System.out.println(i);
		}
		
		
//		Soit la chaine de caractères suivante : String nom = « ETE » ;
//			o Utilisez une méthode de base des énumérations pour retrouver et afficher le
//				libellé de l’instance de Saison dont le nom est ETE.
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom).getLibelle());
		
//		Soit la chaine de caractères suivante : String libelle = « Hiver » ;
//			o Développez une méthode dans votre énumération qui retourne une instance
//				de Saison en fonction du libellé.
//			o Utilisez cette méthode afin de vérifier que c’est bien HIVER qui est retournée
//				lorsque vous la tester avec la variable libelle.
		
		String libelle =  "Hiver";
		System.out.println(Saison.getSaisonByLibelle(libelle));
		
	}

}
