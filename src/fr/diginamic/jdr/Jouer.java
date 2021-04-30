package fr.diginamic.jdr;

public class Jouer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			System.out.println("Bienvenu dans 'SuperJeux', à savoir avant de commancer : \n "
					+ "- Nous allons créer votre hero avec une force (entre 12 et 18) tirée aléatoirement,\n"
					+ "      des points de vie (entre 20 et 50) tirés aléatoirement et un score (à 0) \n "
					+ "- Déroulement d'un combat : Vous allez rencontrer lors de votre périple une créature aléatoire parmis Loups / Goblins / Trolls. \n"
					+ "      C'est un combat tour à tour jusqu'à la mort. A chaque tour votre attaque est calculé par : votre force + un lancé de dé entre 1 et 10. \n"
					+ "      Le personnage dont l'attaque est la plus élevée l'emporte et le perdant subit autant de dégats que la différents des deux attaques. \n "
					+ "- A chaque victoire, votre score augmente, le but étant d'avoir le score le plus élevé. A vous de jouer : \n \n \n");
			
			Methods.game();
			
			
		
		
		
	}

}
