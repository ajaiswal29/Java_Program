package exceptionhandlingdemo;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ThrowsKeywordDemo {
	
	
	//Throws is used to declare an exception and in this only checked exception is handled, unchecked can be handled by programer.

	public void q() throws IOException, SQLException {
		throw new IOException();

	}
	public void w() throws IOException, SQLException {
		q();
	}
	public void r() {
	try {
		w();
		
	}
	catch(Exception e) {
		System.out.println("Exception is handled");}
	}
	
	public static void main(String[] args) {
		
		ThrowsKeywordDemo abc = new ThrowsKeywordDemo();
		abc.r();
		System.out.println("rest of the program");
	}

}
