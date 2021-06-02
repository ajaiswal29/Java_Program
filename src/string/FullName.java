package string;

public class FullName {

	public static void main(String[] args) {
		
		String name1 = "Vishal is a good boy";
		
		// 1.print total length of name

		int length1 = name1.length();
		System.out.println(length1-3);

		// 2.print character at 2nd index
		// NOTE - Indexing always start from 0

		char c = name1.charAt(2);
		System.out.println(c);

		// 3.print last digit of name
		char last = name1.charAt(name1.length() - 1);
		System.out.println(last);

		// 4.full name
		for (int i = 0; i <= name1.length() - 1; i++) {
			
			char f = name1.charAt(i);
			
			System.out.print(f);
		}
		System.out.println();

		// 5.last 3 digits we user substring

		String name = name1.substring(name1.length() - 3, name1.length());

		System.out.println(name);

		// Full name in reverse

		for (int j = name1.length() - 1; j >= 0; j--) {
			System.out.print(name1.charAt(j));
		}
		
		//concat
		System.out.println();
		String tree1 = "Ankit";
		String tree2 = "Jaiswal";
		
		System.out.println(tree1.concat(tree2));
		
		
	
	}

}






