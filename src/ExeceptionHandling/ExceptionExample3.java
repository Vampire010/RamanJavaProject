package ExeceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample3 
{

	public static void readFromFile() throws FileNotFoundException ,IOException
	{
		// Reading from a file
		FileReader reader = new FileReader("C:\\Users\\Rocky\\eclipse-workspace\\Firstbasicproject\\src\\ExeceptionHandling\\sample.txt");
		int ch;
		while ((ch = reader.read()) != -1) {
		    System.out.print((char) ch);
		}
				
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		readFromFile();

	}

}
