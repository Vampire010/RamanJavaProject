package AbstractionExample;

public class Sedan extends Car
{
	@Override
	void start() 
	{
        System.out.println("Starting the gas engine of the Sedan...");
		
	}

	@Override
	void stop() 
	{
        System.out.println("Stopping the Sedan...");
		
	}

	@Override
	void accelerate() 
	{
        System.out.println("Accelerating the Sedan...");
	}
	
}
