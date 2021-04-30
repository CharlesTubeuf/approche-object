package fr.diginamic.operations;

public class TestMoyenne {

	public static void main(String[] args) {


		double[] test = {2.2};
		
		CalculMoyenne a = new CalculMoyenne();
		
		a.ajout(2.2);
		a.ajout(4.2);
		a.ajout(2.2);
		a.ajout(4.2);
		a.ajout(2.2);
		
		System.out.println(a);
		System.out.println( a.calcul());

	}

}
