package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private double salaire;

// CONSTRUCTOR

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	
// METHODS


	@Override
	public String toString() {
		return super.toString() + "Statut : Salarie [salaire=" + salaire + "]";
	}

	@Override
	public void afficherDonnes() {
		System.out.println(toString());// TODO Auto-generated method stub
		
	}

// GETTERS AND SETTERS

	public double getSalaire() {
		return salaire;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	
	
	
}
