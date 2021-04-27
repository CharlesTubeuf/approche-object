package entites2;

import entites.AddressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AddressePostale addresse;

//	CONSTRUCTEURS §§§§§§§§§§§§§§§§§§§§§§§§§§§§§
	
	public Personne(String nom, String prenom, AddressePostale addresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
//	METHODES §§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
	
	public void afficher() {
		System.out.println(nom + " " + prenom.toUpperCase());
	}
	
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}
	
	public void modifierPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom;
	}
	
	public void modifierAddresse(AddressePostale nouvelleAddresse) {
		addresse = nouvelleAddresse;
	}
	
	public String returnNom (Personne a ) {
		return a.nom ; 
	}
	
	public AddressePostale returnAddresse (Personne a ) {
		return a.addresse ; 
	}
	
	public String returnPrenom (Personne a ) {
		return a.prenom ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
