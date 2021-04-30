package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int etage;
	
//	CONSTRUCTEUR
	
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}


// METHODS

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", etage=" + etage + "]";
	}

	
//	 GETTERS ANS SETTERS 

	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public int getEtage() {
		return etage;
	}


	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
}
