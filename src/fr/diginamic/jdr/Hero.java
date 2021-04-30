package fr.diginamic.jdr;

public class Hero extends Personnage {
	
	private int score;
	
	public Hero() {
		super(Methods.getRandomBetween(12,18),Methods.getRandomBetween(20,50));
		score =0;// TODO Auto-generated constructor stub
	}

	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
	
}
