package map;
// No null value allowed
//It does not allow multithreading.

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		
		
		Map<String,String> table = new Hashtable<String,String>();
		
		table.put("Name 1","Ankit" );
		table.put("Name 2", "Mansh");
		table.put("Name 1", "Kushal");
		table.put("Name 3", "Ankur");
		table.put("Name 4", "Ankit");
		
		for (Entry<String, String> S : table.entrySet()) {

			System.out.println(S.getKey() + " " + S.getValue());

		}
		
		
		

	}

}
