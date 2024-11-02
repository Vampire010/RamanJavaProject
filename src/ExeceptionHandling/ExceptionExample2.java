package ExeceptionHandling;

public class ExceptionExample2 
{
	
	public static  void  throwManualException()
	{
		throw new RuntimeException("You Have Been Hacked");		
	}

	public static void main(String[] args) 
	{
		int a = 10 +20;
		throwManualException();
		System.out.println("Addition is: " + a);
	}

}
