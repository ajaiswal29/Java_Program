package polymorphism;

import net.bytebuddy.implementation.bind.annotation.Super;

// having same name but different forms
public class Overloading {
//In overloading method have same name but different parameter. 
//overloading possible in same as well as in child class.
	
	public static void main(String[] args) {

		child c = new child();
		c.sum();
		
		child1 c1 = new child1();
		c1.sum1(10);
		
		
		
		
	}
}

class parent {

	public void sum() {

		int a = 10;
		System.out.println("Hi this is Parent");

	}

}

class child extends parent {

	public void sum(int r) {
		r = 10;
		System.out.println("Hi this child");

	}
}
	

//if we want to print both parent as well as child then we mentioned "super" keyword.


class parent1 {

	public void sum1() {

		int a = 10;
		System.out.println("Hi this is Parent new");

	}

}

class child1 extends parent1 {
   
	public void sum1(int R) {
		
		super.sum1();
		
		System.out.println("Hi this child new ");

	}
}	
	



