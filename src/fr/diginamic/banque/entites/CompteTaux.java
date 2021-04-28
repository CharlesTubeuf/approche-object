package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	double tauxDeRemuneration;
	
	public CompteTaux(int numeroCompte, int soldeCompte, double tauxDeRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxDeRemuneration = tauxDeRemuneration ;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() +"CompteTaux [tauxDeRemuneration=" + tauxDeRemuneration + "]";
	}

	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	
	
	
}
