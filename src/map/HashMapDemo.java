package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//In map data stored in key value pair
//Always 1st column is key and 2nd is value
/*In this only 1 null value is allowed and if multiple written then it overide the parent one.Samething happens with duplicate keys but it allows
duplicate values*/
//It also give in sequence b/c of keys present

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map1 = new HashMap();
	
			map1.put(1, "Book 1");
			map1.put(5, "Book 2");
			map1.put(2, "Book 3");
			map1.put(4, "Book 1");
			map1.put(null, "No books");
			map1.put(null, "Again no books");
			map1.put(45,"Book 5" );
			
			//print in string form for single value
			//System.out.println(map1.get(1));
			
			//print whole key and value
		for (Entry<Integer, String> x : map1.entrySet()) {

			System.out.println(x.getKey() + " " + x.getValue());

		}
	
			//Print in array form
			System.out.println(map1);
			
			//check that it contains keys
			System.out.println(map1.containsKey(4));
			
			//Check values
			System.out.println(map1.containsValue("Book 1"));
	
			//replace value of key 5 with "Many Books"
			map1.replace(5, "Book 2", "Many Books");
			System.out.println(map1);
						
			//Remove 2nd key
			map1.remove(2, "Book 3");
			System.out.println(map1);
			
			//replace all with any aother value
			map1.replaceAll((k,v)->"Same Books");
			System.out.println(map1);
			
			//to print all keys only (no null key prints it gives error
		/*Set<Integer> allkeys = map1.keySet();
		for (int x : allkeys) {
			System.out.println(x);
		}*/
	
	
			//print all values
			Collection<String> allvalues = map1.values();
			for (String s : allvalues) {
				System.out.println(s);
			}
	
	
	
	}

}
