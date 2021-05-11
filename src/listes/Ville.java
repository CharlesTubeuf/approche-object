package listes;

public class Ville {
	
	
	private String nom; 
	private int nbHabitants;
	private Continent continent;

	
	
	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}



	public Continent getContinent() {
		return continent;
	}



	public void setContinent(Continent continent) {
		this.continent = continent;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNbHabitants() {
		return nbHabitants;
	}



	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}




	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent + "]";
	}



	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) object; 
		if(!(this.getNbHabitants()==other.getNbHabitants())) {
			return false;
		}
		else if ((!this.getNom().equals(other.getNom()))){
			return false;
		}
		else {
			return true;
		}
		
	}
}
