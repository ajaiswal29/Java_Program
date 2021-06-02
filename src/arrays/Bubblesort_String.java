package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Bubblesort_String {

	public static void main(String[] args) {
		
		String name = "Ankit";
		
		char[] c = name.toCharArray();
		
		//inbulit method
		Arrays.sort(c);
		System.out.println(c);
		
		//or
		
		//bubble sort
		char temp;

		for (int i = 0; i < c.length; i++) {

			for (int j = i + 1; j < c.length; j++) {

				if (c[i] < c[j]) {

					temp = c[i];
					c[i] = c[j];
					c[j] = temp;

				}

			}
		}

		System.out.println(c);	
		System.out.println(c[1]);
			
	}
		
}