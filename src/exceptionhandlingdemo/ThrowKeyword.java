package exceptionhandlingdemo;

public class ThrowKeyword {
	
	public static void Validate(int age) {
		if (age < 18) {

			//throw new ArithmeticException();
			//or
			throw new ArithmeticException("Not valid");

		} else {
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		
		//calling method in same class
		Validate(16);
		System.out.println("Rest of codes");

	}

}
