package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Operation [] tab = new Operation [4];
		
		Credit credit400 = new Credit("03/03/2021",400);
		Debit debit200 = new Debit("15/03/2021",200);
		Credit credit222 = new Credit("18/03/2021",222);
		Debit debit600 = new Debit("25/03/2021",600);
		
		tab [0] = credit400 ;
		tab [1] = debit200 ;
		tab [2] = credit222 ;
		tab [3] = debit600 ;
		
		for( int i = 0 ; i < tab.length ; i++) {
			System.out.println(tab[i].getType()+ " " + tab[i]);
		}
		
		
		double montantGlobal = 0 ;
		
		for( int i = 0 ; i < tab.length ; i++) {
			if (tab[i].getType() == "CREDIT") {
				montantGlobal += tab[i].getMontant() ;
			}
			else {
				montantGlobal -= tab[i].getMontant() ;
			}
		}
		
		System.out.println("le montant global des opérations est de " + montantGlobal);
		
	}

}
