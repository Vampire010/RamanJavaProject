package Day1;

public class MyFirstJavaProgram
{
	//valid Identifier
	//Integer
	int _a = 10;
	int $b=20;
	static double doubleNumber$s=10;

	//Floating Point
	float floatNumber=10.5f;
	double doubleNumber=10.5;
	
	//Character
	char Print986='0';
	
	//String
	String name="John";		
	String first_Name="John"; 
	String lastName="John"; 
	String LastName="Sith"; 
	
	//Boolean
	 boolean isStudent=true;
     boolean isEmployed=false;
     boolean isMarried=true; 
     boolean isSingle=false; 
   
	//Invalid Identifier
	//int @c=30;
	//String First Name="John"; 
	//int 1stNumber=1;
	//int char=12;
	
    
	public static  void addNumbers() 
	{
	    	MyFirstJavaProgram frstProgram = new MyFirstJavaProgram();	   
			double sum;
			sum = frstProgram._a +  frstProgram.$b + doubleNumber$s;
	        System.out.println("Sum of a and b is: " + sum);		
    }	
	
	public void addNumbers2() 
	{
		addNumbers();
		double sum = _a + $b + doubleNumber$s;
        System.out.println("Sum of a and b is: " + sum);
    }

	public static void main(String[] args) 
	{
		addNumbers();
        System.out.println("Hello, World!");
        MyFirstJavaProgram frstProgram = new MyFirstJavaProgram();	 
        frstProgram.addNumbers2();
    }

}
