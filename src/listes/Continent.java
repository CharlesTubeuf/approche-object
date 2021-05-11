package listes;

public enum Continent {

	AMERIQUE("amérique"),
	AFRIQUE("Afrique"),
	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Océanie");
	
	
	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
	
}
