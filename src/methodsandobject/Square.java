package methodsandobject;

//Question square of given number

public class Square {

	public int squarenum (int a)
	{
		return a*a;
	}
	
	public static void main(String[] args) {
		

    Square abc = new Square();
        int b =  abc.squarenum(4);
		System.out.println(b);
		int c = abc.squarenum(7);
		System.out.println(c);
		
		//OR
		System.out.println(abc.squarenum(8));
		
		
	}

}
