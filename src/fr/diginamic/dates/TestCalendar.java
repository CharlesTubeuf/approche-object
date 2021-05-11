package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2016,4,19,23,59,30);
		Date d1 = calendar.getTime();
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(d1));
		
		calendar.set(2021,4,11,14,11,37);
		Date jour = calendar.getTime();
		SimpleDateFormat formateurHeure = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		System.out.println(formateurHeure.format(jour));
		
		formateurHeure = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.FRANCE);
		System.out.println(formateurHeure.format(jour));
		
		formateurHeure = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.CHINA);
		System.out.println(formateurHeure.format(jour));
		
		formateurHeure = new SimpleDateFormat("EEEEE dd MMMM yyyy", Locale.GERMANY);
		System.out.println(formateurHeure.format(jour));
		
		formateurHeure = new SimpleDateFormat("EEEEE dd MMMM yyyy", new Locale("RU"));
		System.out.println(formateurHeure.format(jour));
	}

}
