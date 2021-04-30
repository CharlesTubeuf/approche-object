package fr.diginamic.jdr;

public abstract class Personnage {
	
	private int force;
	private int vie;
	
	public Personnage(int force, int vie) {
		super();
		this.force = force;
		this.vie = vie;
	}
	
	
	@Override
	public String toString() {
		return "Personnage [force=" + force + ", vie=" + vie + "]";
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	
	
}
