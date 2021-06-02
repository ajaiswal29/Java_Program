package abstraction;

public interface Interface {

	public void A1();
	int a=10;

	public void B1();

}

interface Interface1 {

	public void C();
}

// multiple inheritance
class Child implements Interface, Interface1 {

	public void A1() {

		System.out.println("Class 1");
	}

	public void B1() {

		System.out.println("Class 2");
	}

	public void C() {

		System.out.println("Class 3");
	}

	public static void main(String[] args) {

		Child obj = new Child();

		obj.A1();
		obj.B1();
		obj.C();
	}

}