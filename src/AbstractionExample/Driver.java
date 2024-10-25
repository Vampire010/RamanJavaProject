package AbstractionExample;

public class Driver 
{

	public static void main(String[] args) 
	{
		//Sedan sedan = new Sedan();
		
		Car mysedan = new Sedan();
		mysedan.start();
		mysedan.accelerate();
		mysedan.stop();
		
        Car myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.accelerate();
        myElectricCar.stop();

	}

}
