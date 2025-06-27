package java_workout;

import java.util.LinkedHashSet;
import java.util.Set;

public class array_duplicate_remove {

	public static void main(String[] args) {


		int[] ar = new int[5];
		ar[0] = 100;
		ar[1] = 100;
		ar[2] = 100;
		ar[3] = 300;
		ar[4] = 400;
		Set<Integer> dupe = new LinkedHashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {	
			dupe.add(ar[i]);
		}
		for (Integer filter : dupe) {
			System.out.println(filter);
		}

	}

}
