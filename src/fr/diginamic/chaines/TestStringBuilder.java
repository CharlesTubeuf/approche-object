package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		
		long debut = System.currentTimeMillis();
			{
			String test = "";
			for (int i = 0 ; i < 100000; i++) {
				test += i;
			}
			}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
		

		long debut1 = System.currentTimeMillis();
		{
		String test = "";
			StringBuilder test2 = new StringBuilder();
					for (int i = 0 ; i < 100000; i++) {
				test2.append(i);
			}
		}
		long fin1 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes :" + (fin1 - debut1));
		
	}

}
