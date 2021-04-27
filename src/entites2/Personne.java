package entites2;

import entites.AddressePostale;

public class Personne {

	public String nom;
	public String prénom;
	public AddressePostale addresse;

	public Personne(String nom, String prénom, AddressePostale addresse) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.addresse = addresse;
	}

	public Personne(String nom, String prénom) {
		super();
		this.nom = nom;
		this.prénom = prénom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
