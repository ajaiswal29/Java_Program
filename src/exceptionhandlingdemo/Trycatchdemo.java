package exceptionhandlingdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trycatchdemo {

	public static void main(String[] args) {
		
		
		//arithmatic exception
		Scanner input = new Scanner(System.in);
		System.out.println("Enter int a");
		int a = input.nextInt();
		System.out.println("Enter int b");
		int b = input.nextInt();
		
		try {
			
			int c = a/b;
			System.out.println(c);
		}
	
		catch(ArithmeticException e) {
			
			System.out.println("O is not divided");
		}
	
		//Arrayoutofbound
		
		int[] array = {1,2,3,4};
		
		try {
			System.out.println(array[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of box");
		}
		
		//Checked exception
		
		PrintWriter pw;
		try {
		
			pw = new PrintWriter("jtp.txt");
		    pw.println("saved");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Exception");
			
			
			
		}
	}
}

