package Day1;

public class House 
{

	//Static Method Definitions
	public static void Gate()
	{		
		System.out.println("Guests Arried at the gate");
	}
	
	//Concrete Method Definitions
	private void Hall()
	{
		System.out.println("Guests Welcomed in the Hall");		
	}
	
	//Method with return type and parameters
	protected void askSomething(String message)
	{
		System.out.println("Sure Here is: " + message);		
	}
	
	//Method with return type
	double ForGuests()
	{
		Double gift = 1000.00;  		
		return gift;
	}
	
	public String closeGuests()
	{
		String gift = "Remote Car, Clothes , Money";  		
		return gift;
	}
	
	public static void main(String[] args) 
	{
		Gate();		
		House house = new House();
		house.Hall();
		house.askSomething("Water");
		/*house.ForGuests();
		house.closeGuests(); */
		System.out.println(house.ForGuests());
		System.out.println(house.closeGuests());

	}

}
