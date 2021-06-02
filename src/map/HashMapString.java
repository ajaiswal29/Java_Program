package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapString {

	public static void main(String[] args) {
		
		// find how many time a,b,c,d,e occurs in String "abcdabe"
		
		//First convert into character array
		
		String name = "abcdabeaae";
		
		
		char[] allchar = name.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
			for (char x : allchar) {
				
				if(map.containsKey(x)) {
					int newvalue = map.get(x)+1;
					map.put(x, newvalue);
				}
				else
				{
					map.put(x, 1);
				}
			
			}
			System.out.println(map);
			
		
	}

}
