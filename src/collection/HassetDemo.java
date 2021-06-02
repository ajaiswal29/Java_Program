package collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HassetDemo {
	
	public static void main (String []args) {
		
		
	Set<String> s = new HashSet<String>();
	//OR
	//Set s = new HashSet ();
	
	s.add("Jaiswal 1");
	s.add("Jaiswal 3");
	s.add("Jaiswal 3");
	s.add("Jaiswal 2");
	s.add("Jaiswal 4");
	s.add(null);
	s.add(null);
	System.out.println(s);
	
	for (String x : s) {
		System.out.println(x);
	}
	
	//remove "Jaiswal 2" with "Mahant"
	
	for (int rem =0;rem<s.size();rem++) {
		
		s.remove("Jaiswal 2");
		s.add("Mahant");
		
		
		
	}
	
	System.out.println(s);
	
	//add Jaiswal 5 from another list
	
	List<String> l = new ArrayList<String>(s);
	
	l.add("Jaiswal 5");
	
	System.out.println(l);
	
	Iterator<String> itr = l.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	}
}
	
	/*//Imp - Create HashSet of Book i.e adding books to set and print all the books
		
		class Book{
			
			int id;
			String name,author,publisher;
			int quantity;
			
			public Book (int id,String name,String author,String publisher,int quantity) {
				
				this.id=id;
				this.name=name;
				this.author=author;
				this.publisher=publisher;
				this.quantity=quantity;
			}
		}
			public class HassetDemo {
				
				public static void main(String[]args) {
										
					Set<Book> set = new HashSet<Book>();
					
					//Creating Books
					Book b1 = new Book(1,"Let us C","Yashwant","Nootan",2);
					Book b2 = new Book(2,"Java","Bagga","Nootan",4);
					
					//Adding books to set
					
					set.add(b1);
					set.add(b2);
					
					//Transvering elements
					
					for (Book b : set) {
						System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
					}
					
					
		
		
		
		
		}
	*/
	
	
	

			
