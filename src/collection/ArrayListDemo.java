package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayListDemo {

	// syntax List <Datatype> = new ArrayList();

	public static void main(String[] args) {

		/*List xyz = new ArrayList();

		xyz.add(1);
		xyz.add("Akhliesh");
		xyz.add("a");
		xyz.add(1.2f);

		System.out.println(xyz.size());*/

	//Store only String
		
		List<String> abc = new ArrayList<String>();
	
			abc.add("Ankit 1");
			abc.add("Ankit 2");
			abc.add("Ankit 1");
			abc.add("Manish");
			abc.add(null);
			abc.add(null);
			System.out.println(abc);// to print in array
			System.out.println(abc.size()); //o/p = 6
			System.out.println(abc.get(1)); //o/p = Ankit 2
			
			
			
			
			
			
			//print all names
			//1.using extended for loop			
			/*for (String x : abc)
				System.out.println(x);*/
	
			
			//2.Using iterable method (imp)  
			//hasNext() returns true or false
			//next() returns the element and move the cursor to next element
			//remove() remove last element return by the iterator
		/*	
		Iterator<String> itr = abc.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println();*/	
		
	//Replace "Ankit 2" with "Ankit Jaiswal"
 		
		  
		for (int s=0;s<abc.size();s++) {
			abc.set(1, "Ankit Jaiswal"); 
			System.out.println(abc.get(s));
		}
		
		//OR
		
		/*for (int i = 0; i < abc.size(); i++) {

			if (abc.get(i).equals("Ankit 2")) {

				abc.remove(i);
				abc.add(i, "Ankit Jaiswal");
			}

			System.out.println(abc.get(i));
		}
		System.out.println();*/
		//OR
		
		abc.set(1, "Ankit Jaiswal1");
		Iterator<String> iter = abc.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		
		//3.Check that it contains "Ankit 2" i.e true or false
		
		System.out.println(abc.contains("Ankit 2"));
		System.out.println(abc.contains("Ankit Jaiswal1"));
		 
		
		//print all in reverse order we use Collections.reverse method
		
			Collections.reverse(abc);
			//Print in Array form
			System.out.println("Reversed List" +abc);
			//or print in String
			for (String xy : abc) {
				System.out.println(xy);
			}
			
			
		}
		
	}
	
	
	
	
	
	


