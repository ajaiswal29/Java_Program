package polymorphism;

public class Covariant {

	public static void main(String[] args) {

		C2 covariant = new C2();

		System.out.println(covariant.parent2("Ankit"));
		
		
	}

}

class P2 {

	public int parent2(int t) {
		return t;

	}
}

class C2 extends P2 {

	public String parent2(String name) {

		return name;
	}

}
