package ExeceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionExample1
{

	public static void main(String[] args) 
	{
	  try
	  {
		  double division = 10/2;
		  System.out.println("division is: " + division);
		  
		  FileReader reader = new FileReader("C:\\Users\\Rocky\\eclipse-workspace\\Firstbasicproject\\src\\ExeceptionHandling\\sample.txt");
		  int ch;
		  try {
				while ((ch = reader.read()) != -1) 
				  {
				      System.out.print((char) ch);
				  }
				System.out.println();
		  	} 
		  catch (IOException e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
      }
	  catch(ArithmeticException  e)
	  {
		  System.out.println("ArithmeticException occurred: " + e.getMessage());          ;
	  }
	  catch(NullPointerException e)
	  {
		  System.out.println("NullPointerException occurred: " + e.getMessage());          
	  }
	  catch(FileNotFoundException e)
	  {
		  System.out.println("FileNotFoundException occurred: " + e.getMessage());          
	  }
	  finally 
	    {
            System.out.println("This block always executes.");
        }

	  
		double multiplication = 10*0;
		System.out.println("multiplication is: " + multiplication);
	
	}
	

	
}
/*
try
{
	try
	{
		try{}
		catch{}
	}
	catch{}
}
catch{}
try{}
catch{}


*/