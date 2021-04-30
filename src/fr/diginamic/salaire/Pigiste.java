package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	private int nbJour;
	private double tauxJournalier;
	
// CONSTRUCTOR	
	
	public Pigiste(String nom, String prenom, int nbJour, double tauxJournalier) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.tauxJournalier = tauxJournalier;
	}

//	METHODS
	
	@Override
	public double getSalaire() {

		return nbJour*tauxJournalier;
	}

	@Override
	public String toString() {
		return super.toString() + "Statut : Pigiste [nbJour=" + nbJour + ", tauxJournalier=" + tauxJournalier + ", salaire= " + getSalaire() + "]";
	}
	

	@Override
	public void afficherDonnes() {
		
		System.out.println(toString());
	}
	
// GETTERS AND SETTERS 



	public int getNbJour() {
		return nbJour;
	}

	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}

	public double getTauxJournalier() {
		return tauxJournalier;
	}

	public void setTauxJournalier(double tauxJournalier) {
		this.tauxJournalier = tauxJournalier;
	}


		
}
