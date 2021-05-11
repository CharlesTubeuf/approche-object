package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS("Printemps",1),
	ETE("Eté",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private String libelle;
	private int numOrdre;
	

	private Saison(String libelle, int numOrdre) {
		this.libelle = libelle;
		this.numOrdre = numOrdre;
	}
	
	public static Saison getSaisonByLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison i : saisons) {
			if(i.getLibelle().equals(libelle)) {
				return i;
			}		
		}
		return null;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public int getNumOrdre() {
		return numOrdre;
	}
	
}
