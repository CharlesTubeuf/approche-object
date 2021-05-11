package listes;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville herblay = new Ville("Herblay",37000,Continent.EUROPE);
		Ville paris = new Ville("Paris", 1_600_000,Continent.EUROPE);
		Ville herblayBis = new Ville("Herblay",37000,Continent.EUROPE);
		System.out.println(herblay.equals(herblayBis));
		System.out.println(herblay.equals(paris));
		System.out.println(herblay==herblayBis);
		System.out.println(herblay==paris);
		
		herblay=herblayBis;
		System.out.println(herblay==herblayBis);
		
	}

}
