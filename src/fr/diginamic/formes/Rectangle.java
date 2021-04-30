package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double longueur;
	private double largeur;
	
	
	

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

//	METHODS
	
	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

	@Override
	public double calculerSurface() {
		
		return longueur*largeur;
	}

	@Override
	public double calculerPerimetre() {
		
		return (longueur*2 + largeur*2);
	}

//	GETTERST AND SETTERS 
	
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
