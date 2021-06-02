package inheritance;
//cannot create 2 public class because in 1 source file only public class exist which compilation faster.
//Also public class has file name as of .java (source) file.
public class Inherit {

	public static void main(String[] args) {

		Child obj = new Child();

		obj.m3();
		System.out.println(obj.a);
		

		Parent obj1 = new Child();
		
		//we are able to call parent method not child method
		obj1.m1();
		obj1.m3();
		obj1.sing();
		
				
	}
}

class Parent {
	
	int a=10;

	public void m1() {
		System.out.println("This is Kamal");
	}
	public void sing() {
		System.out.println("Ankit");
	}
	public void m3() {
		System.out.println("high package");
	}
	}



class Child extends Parent {
	public void m2() {
		System.out.println("This is Ankit");
	}
	public void sing() {
		System.out.println("Jaiswal");
	}
	public void m4() {
		System.out.println("for high package switch");
	}


}



