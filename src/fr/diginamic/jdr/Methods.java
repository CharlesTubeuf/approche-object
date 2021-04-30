package fr.diginamic.jdr;

import java.util.Scanner;

public abstract class Methods {

	public static void game() {
		
		int choix = 0;
		Hero hero = null;
		boolean accesScore = false;
		
		while (choix != 4) {
			choix = menu();
			switch (choix) {
			case 1:
				hero = new Hero();
				System.out.println(" Votre héro est créer, il possède " + hero.getVie() + " pts de vie et "
						+ hero.getForce() + " pts de force. \n");
				accesScore =true;
				break;
			case 2:
				if(accesScore == false) {
					System.out.println("Vous devez d'abord creer un hero pour pouvoir affronter une créature... \n");
					break;
				}
				if(hero.getVie()>0) {
					Mechant mechant = creerMechant();
					System.out.println("Vous êtes face à un " +mechant.getClass().getSimpleName() + " de force "+ mechant.getForce()+ " avec "+ mechant.getVie()+" pts de vie. \n");
					combattre(hero, mechant);
					break;
				} else {
					System.out.println("Votre hero est mort, vous devez d'abord en créer un nouveau avant d'affronter des créatures...");
					break;
				}			
			case 3:
				if(accesScore == false) {
					System.out.println("Vous devez d'abord creer un hero pour voir son score.. \n");
					break;
				}
				System.out.println(" Votre score est actuellement de "+ hero.getScore() +"\n");
				break;
			case 4:
				System.out.println("Vous avez décidé d'arrêter de jouer. \n Au revoir... \n");
				break;
			default :
				System.out.println("Mauvais paramètre renseigné : tapper 1, 2, 3 ou 4 \n");
			}
		}

	}

	public static int getRandomBetween(int min, int max) {
		min = (int) Math.ceil(min);
		max = (int) Math.floor(max);
		return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}

	private static int menu() {

		System.out.println("    Veuillez choisir une option : \n " + "1- Créer un personnage (Recommencer) \n "
				+ "2- Combattre une créature \n " + "3- Afficher votre score \n " + "4- Arrêter de jouer \n");

		Scanner scanner = new Scanner(System.in);
		int choix = scanner.nextInt();
		while (choix < 1 || choix > 4) {
			System.out.println("Vous devez rentrer 1, 2, 3 ou 4 \n");
			choix = scanner.nextInt();
		}
		return choix;
	}

	private static Mechant creerMechant() {
		int random = Methods.getRandomBetween(1,3);
		switch (random) {
		case 1:
			Mechant loup = new Loup();
			return loup;
		case 2:
			Mechant goblin = new Goblin();
			return goblin;
		case 3:
			Mechant troll = new Troll();
			return troll;
		default :
			 return loup = new Loup();
		}
		
	}
	
	private static void conditionVictoire(Hero hero, Mechant mechant) {
		if (hero.getVie()<1) {
			System.out.println("\n YOU LOOSE :( \n Vous avez obtenu le score de : "+ hero.getScore()+"\n Vous pouvez recréer un héro");
		}
		if (mechant.getVie()<1) {
			
			if( mechant.getClass().getSimpleName().equalsIgnoreCase("Loup")) {
				System.out.println("\n YOU WIN :) \n Le Loup est mort, votre score augmente de 1 \n \n Vous pouvez consulter votre score et engager le combat contre une autre créature ! ");
				hero.setScore(hero.getScore()+1);
			}
			if( mechant.getClass().getSimpleName().equalsIgnoreCase("Goblin")) {
				System.out.println("\n YOU WIN :) \n Le Goblin est mort, votre score augmente de 2 \n \n Vous pouvez consulter votre score et engager le combat contre une autre créature ! ");
				hero.setScore(hero.getScore()+2);
			}
			if( mechant.getClass().getSimpleName().equalsIgnoreCase("Troll")) {
				System.out.println("\n YOU WIN :) \n Le Troll est mort, votre score augmente de 5 \n \n Vous pouvez consulter votre score et engager le combat contre une autre créature ! ");
				hero.setScore(hero.getScore()+5);
			}
			
		}
	}
	
	private static void combattre(Hero hero, Mechant mechant) {
		
		System.out.println("\n \n Votre vie  | votre adversaire \n");
		while (hero.getVie()>0 && mechant.getVie()>0) {
		
			int attaqueMechant = mechant.getForce()+ Methods.getRandomBetween(1,10);		
			int attaqueHero = hero.getForce()+Methods.getRandomBetween(1,10);
//			System.out.println("L'attaque du "+mechant.getClass().getSimpleName() +" est de "+attaqueMechant+". Votre attaque est de :" + attaqueHero + " \n");
			
			if(attaqueMechant > attaqueHero) {
				System.out.println("     "+hero.getVie()+"           "+mechant.getVie()+"               Le "+mechant.getClass().getSimpleName()+" frappe "+ (attaqueMechant-attaqueHero));
				hero.setVie(hero.getVie()-(attaqueMechant-attaqueHero));
			}
			if(attaqueMechant < attaqueHero) {
				System.out.println("     "+hero.getVie()+"           "+mechant.getVie()+"               Vous frappez de "+ (attaqueHero-attaqueMechant));
				mechant.setVie(mechant.getVie()-(attaqueHero-attaqueMechant));
			}
			conditionVictoire(hero, mechant);
		}
	}
}
