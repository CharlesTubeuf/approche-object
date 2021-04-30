package fr.diginamic.entites;

public class Theatre {
	private String nom; 
	private int capaciteMax;
	private int inscrits; 
	private double recette;
	
	
//	CONSTRUCTOR
	public Theatre(String nom, int capaciteMax, int inscrits, double recette) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.inscrits = inscrits;
		this.recette = recette;
	}
	
	
//	METHODS
	public void inscrire(int nbClient, double prix) {
		if(capaciteMax >= nbClient +inscrits) {
			recette += prix *nbClient;
			inscrits += nbClient ;
		}
		else {
			System.out.println("Erreur : vous dépasserez la capacité maximal de client avec ces nouveaux inscrits... il reste "+ (capaciteMax-inscrits)+" places disponibles.");
		}
	}
	
@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capaciteMax=" + capaciteMax + ", inscrits=" + inscrits + ", recette="
				+ recette + "]";
	}


	//	 GETTERS AND SETTERS 
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapaciteMax() {
		return capaciteMax;
	}
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}
	public int getInscrits() {
		return inscrits;
	}
	public void setInscrits(int inscrits) {
		this.inscrits = inscrits;
	}
	public double getRecette() {
		return recette;
	}
	public void setRecette(double recette) {
		this.recette = recette;
	}
	
	
}
