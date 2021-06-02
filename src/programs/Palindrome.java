package programs;

import java.util.Scanner;

//If number or string is same from forward and backward is palindrome eg - 151, 343, 12121, LOL, MADAM etc
public class Palindrome {
	
	//Check MADAM is palindrom or not
	/*public static void main(String[] args) {

		String n = "MADAM";
		int pal;
		String total = "";
		for (pal = n.length() - 1; pal >= 0; pal--) {

			total = total + n.charAt(pal);
		}
		if (n.equals(total)) {

			System.out.println("This is palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
	}
}
*/


//check 12121 is palindrome or not

	/*public static void main(String[] args) {

		int n = 16765;
		int sum = 0;
		int r;
		int temp = n;
		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("This is Palindrome");

		} else {
			System.out.println("This is not palindrome");
		}
	}

}*/
	
//Take input from user
	
	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Text to check - ");
		String text = obj.nextLine();

		String input = text;
		int reverse;
		String tempo = "";

		for (reverse = input.length() - 1; reverse >= 0; reverse--) {

			tempo = tempo + input.charAt(reverse);

		}

		if (input.equals(tempo)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}
}