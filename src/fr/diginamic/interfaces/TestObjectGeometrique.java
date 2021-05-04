package fr.diginamic.interfaces;

public class TestObjectGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		tab[0] = new Cercle(4);
		tab[1] = new Rectangle(4,2);
		
		for( ObjetGeometrique i  : tab) {
			System.out.println("la surface : " + i.surface() + " et le périmetre :" + i.perimetre());
		}
		
	}

}
