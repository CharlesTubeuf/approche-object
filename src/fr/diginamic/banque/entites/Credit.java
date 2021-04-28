package fr.diginamic.banque.entites;

public class Credit extends Operation{

	public Credit(String date, double montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

	
	
}
