package programs;

public class Power {
	
	public static void main (String [] args) {
		
		//using while loop
		int R = 2;
		int t = 2;
		int w = 0;

		while (w < 5) {

			R = R * t;
			w++;

		}
		System.out.println(R);
	    
	
	
		
		//By using for loop
	
	//Here number is the base and p is the exponent
    int number = 2, r = 2;
    
    for (int i=1;i<5;i++) {
    	
    	number=number*r;
    	
    }
    System.out.println("2^5=" +number);
    
    }
}
	
	
	

