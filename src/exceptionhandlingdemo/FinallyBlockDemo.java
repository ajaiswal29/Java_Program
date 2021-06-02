package exceptionhandlingdemo;

public class FinallyBlockDemo {
	
	public static void main (String[]args) {
		
		//Exception handled
		/*try {

			int c = 25 / 2;
			System.out.println(c);
		} catch (NullPointerException d) {
			System.out.println(d);

		}
		finally {
			System.out.println("Finally always executed");
			System.out.println("rest program");
		}*/
		
		//Exception not handled
		try {

			int f = 25 / 0;
			System.out.println(f);
		} catch (NullPointerException e) {
			System.out.println(e);

		} finally {
			System.out.println("Finally always executed always");
			System.out.println("rest program");

		}
	}

}
