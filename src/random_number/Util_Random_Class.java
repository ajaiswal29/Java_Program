package random_number;

import java.util.Random;

public class Util_Random_Class {

	public static void main(String[] args) {
		
		Random objgenterator = new Random();
		
		int count;
		
		for (count=0;count<10;count++) {
			
			//generate 10 random number between 0 to 100 
			int randomnumber = objgenterator.nextInt(100);
			System.out.println("Random numbers " +randomnumber);
		}

	}

}
