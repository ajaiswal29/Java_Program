package exceptionhandlingdemo;

//at a time only 1 exception occurs and only 1 catch block executed
//exception started from specific one to general one.


public class Multitrycatch {

	public static void main(String[] args) {
		
		try {

			int a[] = { 1, 2, 3, 5 };
			a[5] = 10 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bound");
		} catch (Throwable e) {
			System.out.println("rest of the code");
		}
	
		//now we write general exception 1st then specific one
		try {

			int b[] = { 1, 2, 3, 4, 5 };
			b[4] = 10 / 0;
			System.out.println(b[6]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Error");
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic");
		}
	
		//nested try statements
		try {
			try {
				System.out.println("going to divide");
				int f = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int g[] = new int[5];
				g[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
		 }  
	}


