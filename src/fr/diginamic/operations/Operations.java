package fr.diginamic.operations;

public class Operations {

		
	public static double calcul(double a, double b, char operation) {
		
		switch(operation) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if (b == 0) {
				System.out.println("error, vous ne pouvez pas diviser par zero...");
				return 0;				
			}
			return a/b;
		default :
			System.out.println("Vous n'avez pas rentrez un opérateur valide");
			return 0;
		}
	}
	

}
