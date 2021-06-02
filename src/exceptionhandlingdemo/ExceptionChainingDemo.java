package exceptionhandlingdemo;

import java.io.IOException;

public class ExceptionChainingDemo {
	
	public void m() {

		int data = 50 / 0;

	}

	public void n() {
		m();
	}

	public void w() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Here exception is handled");
		}
	}

	public static void main(String[] args) {

		ExceptionChainingDemo call = new ExceptionChainingDemo();
		call.w();
		

	
		
		//Checked Exception is not handled in Exception Chaining
		/*public void ab() {
			throw new java.io.IOException("Exception generated");
		}
		public void ac() {
			ab();
		}
		public void bc() {
			try {
			ac();
			}
			catch(Exception e) {
				System.out.println("Exception handled");
			}
		}*/


}
}
