package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom; 
	private String prenom;
	
//	CONSTRUCTOR
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
//	METHODS
	
	public abstract double getSalaire();
	
	public abstract void afficherDonnes();
	
	@Override
	public String toString() {
		return "Intervenant [nom=" + nom + ", prenom=" + prenom + "]";
	}
		
	
	
//	GETTERS AND SETTERS
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	} 
	
	
	
}
