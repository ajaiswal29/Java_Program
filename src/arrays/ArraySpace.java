package arrays;

import org.apache.commons.exec.util.StringUtils;

public class ArraySpace {
	
	public static void main (String[]args) {
		
		String name = "  I am   Ankit  Jaiswal  ";
		
		String replace = name.replaceAll("\\s+"," ").trim();
		
		System.out.println(replace);
		
		//trim function
		String abc = " Hello World ";
		System.out.println(abc.trim());
		
		
		
		
	}

}
