package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		
		//sort array in ascending order.
		int arr[] = {20,21,23,22,24,89};

		Arrays.sort(arr);
		
		System.out.println("Sorted Array" +Arrays.toString(arr));
		
		
		//sort in descending order
		//In descending we use collection.reverseorder so for that we use integer not int.
		
		Integer array[] = {101,120,320,500};
		
		Arrays.sort(array,Collections.reverseOrder());
		
		
		System.out.println("Sorted in Descending" +Arrays.toString(array));
		//2nd highest
		System.out.println(array[1]);
		
		
		
		
		
	}

}
