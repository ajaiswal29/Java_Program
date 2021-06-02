package exceptionhandlingdemo;

public class Finalize {
	
	public void finalmethod() {
		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		
		Finalize fine = new Finalize();
		fine = null;
		System.gc();

	}

}
