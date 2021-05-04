package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);

//		Affichez tous les éléments de la collection

		Iterator<Double> iter = set.iterator();

		while (iter.hasNext()) {
			Double nombre = iter.next();
			System.out.println(nombre);
		}


	}

}
