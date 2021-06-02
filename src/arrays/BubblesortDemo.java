package arrays;

import java.util.Arrays;

public class BubblesortDemo {

	public static void main(String[] args) {
		
		
		int[] arra = new int[5];

		arra[0] = 1;
		arra[1] = 10;
		arra[2] = 9;
		arra[3] = 15;
		arra[4] = 20;

		// or int arra[] = new int[] {1,10,9,15,20};

		int temp = 0;

		for (int i = 0; i < arra.length; i++) {

			// Display elements of original array
			// System.out.println(arra[i]);

			for (int j = i + 1; j < arra.length; j++) {
				// for descending use '<' and for ascending '>'
				if (arra[i] > arra[j]) {

					temp = arra[i];
					arra[i] = arra[j];
					arra[j] = temp;

				}
			}
		}

		// Display elements after sorting
		for (int k = 0; k < arra.length; k++) {
			System.out.print(arra[k] + " ");

		}

		// to print in array form
		System.out.println(Arrays.toString(arra));
	
	
	}}
