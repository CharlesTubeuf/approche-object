package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 9;
		int c = 0;
		
		System.out.println( Operations.calcul(a,b,'-'));
		System.out.println( Operations.calcul(a,b,'+'));
		System.out.println( Operations.calcul(a,b,'/'));
		System.out.println( Operations.calcul(a,b,'*'));
		System.out.println( Operations.calcul(a,c,'/'));
	}

		

}
