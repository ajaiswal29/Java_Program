package programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class StringRemDuplicate {
	
	public void removeduplicate(String value) {
		
		Set<Character> ch = new HashSet<>();

		for (int i = 0; i < value.length(); i++) {

			ch.add(value.charAt(i));
		}
			for (Character abc : ch) {
				System.out.print(abc);
			}
		}

	

	public static void main(String[] args) {
		
		StringRemDuplicate rem = new StringRemDuplicate();
		
		String value = "geeksforgeeks";
		rem.removeduplicate(value);

	}

}
