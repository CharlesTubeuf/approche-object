package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

	public static void main(String[] args) {
		
		List<Integer> entier = new ArrayList<Integer>();
		for (int i = 0; i <100; i++) {
			entier.add(i+1);
		}
		
		System.out.println(entier.size());
	}
	
}
