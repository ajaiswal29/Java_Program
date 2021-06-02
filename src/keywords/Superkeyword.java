package keywords;

import net.bytebuddy.implementation.bind.annotation.Super;

// Super keyword is reference variable which is used to refer immediate parent class object.
public class Superkeyword {

	public static void main(String[] args) {
		
	//child c = new child();
	
	child1 c1 = new child1();
	c1.P1();

	}

}

//1. By using it with constructor

class parent {

	parent() {

		System.out.println("This is parent");

	}

}

class child extends parent {

	child() {
		super();
		System.out.println("This is child");
	}
}

//2.By using it with method

class parent1 {

	public void P1() {
		System.out.println("This is father");
	}

}

class child1 extends parent1 {

	public void P1() {

		super.P1();
		System.out.println("This is now child");

	}
}