package methodsandobject;
public class Boolean {

//question - if number is divisible by 2 then return true else false.

public boolean divisble (int x) {
	
	if (x%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public static void main(String args[]) {
	
	Boolean abc = new Boolean();
	
	System.out.println(abc.divisble(6));
		
		

	}

}
