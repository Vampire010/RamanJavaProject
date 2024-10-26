package InetrfaceExample;

public class Sedan implements CarInterface , CarOwner
{
	@Override
	public void start() 
	{
        System.out.println("Starting the gas engine of the Sedan...");
		
	}

	@Override
	public void stop() 
	{
        System.out.println("Stopping the Sedan...");
		
	}

	@Override
	public void accelerate() 
	{
        System.out.println("Accelerating the Sedan...");
	}

	@Override
	public void CarKeys() {
        System.out.println("Here is the Car Keys of the Sedan...");

	}
	
}
