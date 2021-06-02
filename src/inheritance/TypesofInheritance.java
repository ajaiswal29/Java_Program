package inheritance;

public class TypesofInheritance {

	public static void main(String[] args) {
		
	H1 obj = new H1();
	obj.m6();
	
	
	}}	
	
		
//1.Single Inheritance

	/*	class C1 {
			int a = 10;

			public void m1() {
				System.out.println("Method 1");
			}
		}
		
		class C2 extends C1 {
			public void m2() {
				System.out.println("Method 2");
			}
		}*/
		
//Multilevel Inheritance
		
		/*class MC1 {
			public void m3() {
				System.out.println("Method 3");
			}
		}

		class MC2 extends MC1{
			public void m4() {
				System.out.println("Method 4");
			}
		}
	
		class MC3 extends MC2{
			public void m5() {
				System.out.println("Method 5");
			}
		}*/
	
//Hierarchical inheritance
		
		class H1{
			protected void m6() {
				System.out.println("Method 6");
			}
		}
		class H2 extends H1{
			private H2() {}//private constructor (if you make private constructor then you cannot make object of that class also you cannot inherit it.
			public void m7() {
				System.out.println("Method 4");
			}
		}
		
		class H3 extends H1{
			public void m8() {
				System.out.println("Method 5");
			}
		
	
	
	
	
	
	
	}


