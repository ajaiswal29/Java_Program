package patterns;

import java.util.Scanner;

public class Userinputpattern {
	
	
	public static void main (String[]args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter count");
		int a = obj.nextInt();
		System.out.println(a);
		
		
		//print diamond
		for (int j=1;j<=a;j++) {
			
			for (int i=a;i>j;i--) {
				System.out.print(" ");
			}
			for (int k=1;k<=j;k++)
			{
			System.out.print("* ");	
			}
			System.out.println("");
		}
			
			for (int l=a-1;l>=1;l--) {
				
				for (int m=a-1;m>l;m--) {
					System.out.print(" ");
				}
				for (int n=1;n<=l;n++) {
					System.out.print(" *");
				}
				System.out.println("");

				}
		}

		
	}


