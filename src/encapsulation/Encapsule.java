package encapsulation;
// Class is fully encapsulated when private data members are present and there will be getter & setter method.
public class Encapsule {
	
	private String name;

	// getter method for name
	public String getname() {
		return name;
	}

	// setter method for name
	public void setnames(String name) {
		this.name = name;
	}

	/*public static void main(String[] args) {

		Encapsule E = new Encapsule();

		E.setnames("Ankit");
		System.out.println(E.getname());

	}*/


//1. Only Read method

	private String name1 = "Ankit";
	public String getnewname() {
		return name1;
	}

public static void main(String[] args) {

	Encapsule E = new Encapsule();

	System.out.println(E.getnewname());
}


//2.Only write method
	
	private String schoolname;
	public void setschoolname (String schoolname) {
		this.schoolname = schoolname;
	}
		
}

