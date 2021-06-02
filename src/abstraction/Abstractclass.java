package abstraction;

//Abstract class can have both abstract method and non abstract method
abstract class Abstractclass {

	public abstract void Bike();

	public void b() {
		int x = 10;
		int y = 11;
		int sum = x + y;
		

		System.out.println(sum);
	}
}

class Honda extends Abstractclass {

	public void Bike() {
		System.out.println("Enter the values");
	}

}

class TestAbstraction2 {
	public static void main(String args[]) {
		Abstractclass obj = new Honda();
		obj.Bike();
		obj.b();
	}
}

//2. In Abstraction multiple inheritance is not possible

abstract class Abs1{
	
	public abstract int m1();
}	

class Abs2 extends Abs1{
	
	
	
	public int m1() {
	return 10;
	
}

}

class Abs3 {
	
	public static void main (String[]args) {
		
		Abs1 obj1 = new Abs2();
		System.out.println(obj1.m1());
		
		
	}
	
}


