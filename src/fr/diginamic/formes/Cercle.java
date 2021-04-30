package fr.diginamic.formes;

public class Cercle extends Forme{
	
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.pow(rayon,2) * Math.PI;
	}
	
	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return rayon * 2 * Math.PI;
	}
	
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}


	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	
	
}
