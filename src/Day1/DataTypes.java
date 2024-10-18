package Day1;

public class DataTypes 
{
	//global members
	 static double salary, wage, portNumber ;
	
	 public static void m1()
	 {
		 //local members
		 int month, day, year ;
		 salary=100000;
		 wage=7.5;
		 portNumber=8080;
		 month=5;
		 day=15;
		 year=2022;
		// length=1000000000;
		// radius=5;
	 }
	 
	 public static void m2()
	 {
		 //local members
		 long length, radius ;
		 salary=100000;
		 wage=7.5;
		 portNumber=8080;
		// month=5;
		// day=15;
		// year=2022;
		 length=1000000000;
		 radius=5;

	 }

	public static void main(String[] args)
	{
		/* byte myByte1 = -129 ;
		 byte myByte2 = 128; */
        MyFirstJavaProgram frstProgram = new MyFirstJavaProgram();	 
        frstProgram.addNumbers2();
        
        House house = new House();
		//house.Hall();
		house.askSomething("Water");
		/*house.ForGuests();
		house.closeGuests(); */
		System.out.println(house.ForGuests());
		System.out.println(house.closeGuests());

		
	}

}
