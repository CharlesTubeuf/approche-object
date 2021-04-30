package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	private double[] tableau = new double[0];

	public void ajout (double nouveau) {
		tableau = Arrays.copyOf(tableau, tableau.length +1);
		tableau[tableau.length-1] = nouveau;
	}
	
	public double calcul() {
		double moyenne = 0;
		for (int i =0 ; i <tableau.length ; i++) {
			moyenne += tableau[i];
		}
		moyenne = moyenne/tableau.length;
		return moyenne; 
	}
	
	public CalculMoyenne() {
		super();
	}

	public double[] getTableau() {
		return tableau;
	}

	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}

	@Override
	public String toString() {
		return "CalculMoyenne [tableau=" + Arrays.toString(tableau) + "]";
	}
	
	
	
}
