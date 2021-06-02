package programs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stringkeysorted {

	public static void main(String[] args) {
		String name = "HelloWorld";

		Map<Character, Integer> abc = new HashMap<>();

		Set<Character> name1 = new HashSet<>();

		for (int i = 0; i < name.length(); i++) {

			

				if (abc.containsKey(name.charAt(i))) {

					int a = abc.get(name.charAt(i));
					abc.put(name.charAt(i), a + 1);
				} else {
					abc.put(name.charAt(i), 1);
				}

			}
		
		//sort according to key value in Descending
		List<Map.Entry<Character,Integer>> list = new LinkedList<>(abc.entrySet());
		
		//Comparator<Map.Entry<Character,Integer>> c = (a,b) -> b.getValue().compareTo(a.getValue());
		//or
		//sort according to key value in Ascending
		Comparator<Map.Entry<Character,Integer>> c = (b,a) -> b.getValue().compareTo(a.getValue());
		
		Collections.sort(list,c);
		System.out.println(list);
	}

}
