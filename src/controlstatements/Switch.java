package controlstatements;

public class Switch {

	public static void main(String[] args) {
		
	//1. print days
		
		int day=5;
		
		switch (day)
		{
		case 1 : 
			System.out.println("monday");
			break;
		case 2 :
			System.out.println("tuesday");
			break;
		default :
			System.out.println("wrong number");
			
	//2.if default is on top
			
			/*switch(day)
			{
				default :
					System.out.println("wrong number");
				case 1 :
					System.out.println("monday");
					break;
				case 2 :
					System.out.println("tuesday");
					break;
					*/
					
	
			
		}
		

	}
}


