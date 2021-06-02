package controlstatements;

import java.util.Arrays;

public class Forloop {

	public static void main(String[] args) {
		
		// Print sentence in reverse
		String name = "Ankit is good";

		/*for (int i = name.length() - 1; i >= 0; i--) {

			System.out.print(name.charAt(i));

		}*/
	

		//EXTENDED for loop 
		
		//syntax for(type variable name : where value stores) 
		
		String[] all = name.split(" ");
		String store = "";

		for (int count = 0; count <= all.length - 1; count++) {
			String word = all[count];
			String space = " ";

			for (int rev = word.length() - 1; rev >= 0; rev--) {

				space = space + word.charAt(rev);

			}
			store = store + space;

		}
		System.out.println(name);
		System.out.println(store);

	}
}


	
