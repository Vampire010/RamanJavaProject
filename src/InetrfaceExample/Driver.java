package InetrfaceExample;

public class Driver
{

	public static void main(String[] args) 
	{
		//Sedan sedan = new Sedan();
		
		CarInterface mysedan = new Sedan();
		CarOwner myCarOwner = new Sedan();	
		myCarOwner.CarKeys();
		mysedan.start();
		mysedan.accelerate();
		mysedan.stop();
		
       /* Car myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.accelerate();
        myElectricCar.stop(); */

	}

}
