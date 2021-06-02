package exceptionhandlingdemo;

import org.omg.CORBA.CustomMarshal;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String s) {
		super(s);
	}

}

public class CustomExceptionDemo {
	
	public static void Ages (int age) throws InvalidAgeException {
		
		if (age < 18) {
			throw new InvalidAgeException("Not Valid");
		}

		else {
			System.out.println("valid age");
		}
		
		
	}


	public static void main(String[] args) {
		
		try {
			Ages(13);
		}
		catch(Exception s) {
			System.out.println("Rest of the program");
		}
	
	}}
