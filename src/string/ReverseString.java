package string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		//1.Print name in reverse
		String name = "This is Ankit";
		
		//1st method without inbuilt function
		for (int w = name.length() - 1; w >= 0; w--) {

			System.out.print(name.charAt(w));
		}
		
		//2nd method using inbuilt function
		/*StringBuffer rf = new StringBuffer(name);
		System.out.println(rf.reverse().toString());*/
		
		//2.Reverse String in same place i.e siht si tiknA
		
		String[] all = name.split(" ");

		String reversedstring =" " ;

		for (int i = 0; i < all.length; i++) {

			String word = all[i];
			String reversedwords = " ";

			for (int j = word.length() - 1; j >= 0; j--) {

				reversedwords = reversedwords + word.charAt(j);

			}
			
			
			reversedstring = reversedstring + reversedwords;
		}

		System.out.println(reversedstring);
		
}}
		
		
		
		
	


