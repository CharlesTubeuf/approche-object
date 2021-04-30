package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

	private Piece[] maison = new Piece[0];

//	constructeur

	public Maison() {
		// TODO Auto-generated constructor stub
	}

//	methods

	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("ATTENTION : La pièce que vous essayer d'ajouter n'existe pas");
			return;
		}
		if (piece.getSuperficie() <= 0) {
			System.out.println("ATTENTION : La superficie de pièce que vous essayer d'ajouter n'est pas cohérente");
			return;
		}
		maison = Arrays.copyOf(maison, maison.length + 1);
		maison[maison.length - 1] = piece;
	}

	public double SuperficieParTypeDePiece(String type) {
		double superficie = 0;
		for (int i = 0; i < maison.length; i++) {
			if ((maison[i].getClass().getSimpleName()).equalsIgnoreCase(type)) {
				superficie += maison[i].getSuperficie();
			}
		}
		return superficie;
	}
	public double nombreDePieceDuType(String type) {
		double count = 0;
		for (int i = 0; i < maison.length; i++) {
			if ((maison[i].getClass().getSimpleName()).equalsIgnoreCase(type)) {
				count++;
			}
		}
		return count;
	}

	public double superficieTotal() {
		double superficie = 0;
		for (int i = 0; i < maison.length; i++) {
			superficie += maison[i].getSuperficie();
		}
		return superficie;
	}

	public double superficieEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < maison.length; i++) {
			if (maison[i].getEtage() == etage) {
				superficie += maison[i].getSuperficie();
			}
		}
		return superficie;
	}

	@Override
	public String toString() {
		return "Maison [maison=" + Arrays.toString(maison) + "]";
	}

// getters and setters 

	public Piece[] getMaison() {
		return maison;
	}

	public void setMaison(Piece[] maison) {
		this.maison = maison;
	}

}
