package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {
		String name = "HelloWorld";

		Map<Character, Integer> abc = new HashMap<>();

		Set<Character> name1 = new HashSet<>();

		for (int i = 0; i < name.length(); i++) {

			if (!name1.add(name.charAt(i))) {

				if (abc.containsKey(name.charAt(i))) {

					int a = abc.get(name.charAt(i));
					abc.put(name.charAt(i), a + 1);
				} else {
					abc.put(name.charAt(i), 2);
				}

			}
		}
		System.out.println(abc);
	}

	{

	}
}