package concatenation;

public class Buffer_Builder {

	public static void main(String[] args) {

		// String Buffer
		StringBuffer abc = new StringBuffer("Ankit");

		abc.append(" Jaiswal");

		System.out.println(abc);

		// String Builder
		StringBuilder abc1 = new StringBuilder("Manish");

		abc1.append(" Jaiswal");

		System.out.println(abc1);

		// String
		String abc2 = "Ankit";
		abc2 = abc2.concat("Jaiswal");
		System.out.println(abc2);

	}

}
