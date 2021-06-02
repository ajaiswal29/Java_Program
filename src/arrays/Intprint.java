package arrays;

public class Intprint {

	public static void main(String[] args) {

		// print digits only
		String name = "Ankit123Jaiswal12";

		name = name.replaceAll("[^\\d]", " ");

		name = name.trim();

		name = name.replaceAll("\\s+", " ");

		System.out.println(name);

		// and

		// print character only
		String name1 = "Ankit123Jaiswal12";

		name1 = name1.replaceAll("[\\d]", " ");

		name1 = name1.trim();

		name1 = name1.replaceAll("\\s+", " ");

		System.out.println(name1);

		// or by using ASCII value
		//ASCII - 0-9 - 48-56
		//ASCII - A-Z - 65-90 , a-z - 97-122

		String name2 = "Ankit123Jaiswal";

		char[] c = name2.toCharArray();

		for (char d : c) {

			if ((int) d >= 48 && (int) d <= 56) {

				System.out.print(d);

			}
		}

	}

}
