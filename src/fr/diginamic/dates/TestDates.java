package fr.diginamic.dates;


import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		
//		Créez une instance de la classe java.util.Date à la date du jour en utilisant un de
//		ses constructeurs
//		o Affichez l’instance ainsi créée au format suivant :jour/mois/année (sans la partie heure)
		
		Date d1 = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formateurHeure = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String affichage = formateur.format(d1);
		System.out.println(affichage);
		
//		Créez une instance de la classe Date à la date du 19/05/2016 à 23 :59 :30
//		secondes
//		o Affichez l’instance ainsi créée au format suivant : année/mois/jour heure:minute:seconde

		Date d2 = new Date(2016-1900,04,19,23,59,30);
		String affichage2 = formateurHeure.format(d2);
		System.out.println(affichage2);
		
//		Créez une instance de Date contenant la date/heure système et affichez-la au
//		même format que ci-dessus.
		
		Date heureSystème = new Date();
		String affichage3 = formateurHeure.format(heureSystème);
		System.out.println(affichage3);
	}

}
