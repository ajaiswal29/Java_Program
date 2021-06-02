package programs;

import java.util.HashMap;
import java.util.Scanner;

public class String_Occurance {
	
		
		public void characterCount(String inputString) 
		{
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		for (char c : strArray) {
		if(charCountMap.containsKey(c)) {
		charCountMap.put(c, charCountMap.get(c)+1);
		}
		else{
		charCountMap.put(c,1);
		}
		}
		System.out.println(inputString+" : "+charCountMap);
		}
		public static void main(String[] args) {
		String_Occurance str = new String_Occurance();
		str.characterCount("Ankit");
		str.characterCount("Welcome to Developer helps");
		str.characterCount("We provide you solutions");
		}
		}
	

