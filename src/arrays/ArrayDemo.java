package arrays;

import java.util.Arrays;
import org.apache.commons.*;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//print all value of array
		int [] allvalue = new int[4];
		
		allvalue[0] = 11;
		allvalue[1] = 22;
		allvalue[2] = 33;
		allvalue[3] = 44;
		System.out.print(Arrays.toString(allvalue));
		System.out.println();
		System.out.println(allvalue.length);

		//1. print reverse array of length 3			
		int even[] = { 55, 66, 77};

		for (int j = 0; j < even.length / 2; j++) {

			int temp = even[j];
			even[j] = even[even.length - 1 - j];
			even[even.length - 1 - j] = temp;

		}
		System.out.println(Arrays.toString(even));

					//OR
		
		for (int i = even.length - 1; i >= 0; i--) {

			System.out.print(even[i] + " ");
			// In string

		}
		System.out.print(Arrays.toString(even));
	
	}
				
				
	}
					
				
				
				
			
			
			
		
		
		
		
	


