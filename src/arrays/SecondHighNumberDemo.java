package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SecondHighNumberDemo {

	public static void main(String[] args) {
		
		
		Integer[] arrys = {-1,2,4,0,7,13};
		
		/*//arrange in descending
		Arrays.sort(arrys,Collections.reverseOrder());
		
		String sorted = Arrays.toString(arrys);
		System.out.println(arrys[1]);*/
		
		
		//OR
		
		//using bubble sort
		
		int temp = 0;
		
		for (int i = 0;i<arrys.length;i++) {
			
			for (int j=i+1;j<arrys.length;j++) {
				
				if (arrys[i]<arrys[j]) {
					
					temp = arrys[i];
					arrys[i] = arrys[j];
					arrys[j] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arrys));
		
		//print 2nd highest
		System.out.println(arrys[1]);
			
	
	}

}
