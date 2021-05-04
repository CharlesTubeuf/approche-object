package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import listes.Ville;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pays> listePays = new ArrayList<>();

		listePays.add(new Pays("france", 65_000_000, "Europe"));
		listePays.add(new Pays("Allemagne", 80_000_000, "Europe"));
		listePays.add(new Pays("Belgique", 10_000_000, "Europe"));
		listePays.add(new Pays("Russie", 150_000_000, "Asie"));
		listePays.add(new Pays("Chine", 1_400_000_000, "Asie"));
		listePays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
		listePays.add(new Pays("Australie", 20_000_000, "Océanie"));

		HashMap<String, Integer> comptePaysParContinent = new HashMap<>();

		for (int i = 0; i < listePays.size(); i++) {
			if (comptePaysParContinent.containsKey(listePays.get(i).getContinent())) {
				comptePaysParContinent.put(listePays.get(i).getContinent(),
						comptePaysParContinent.get(listePays.get(i).getContinent()) + 1);
			} else {
				comptePaysParContinent.put(listePays.get(i).getContinent(), 1);
			}
		}

		Iterator<String> iterKey = comptePaysParContinent.keySet().iterator();
		Iterator<Integer> iterValue = comptePaysParContinent.values().iterator();

		while (iterKey.hasNext()) {

			System.out.println((iterKey.next()) + " : " + iterValue.next() + " pays");
		}

	}

}
