package InetrfaceExample;

public class ElectricCar implements CarInterface , CarOwner
{
	@Override
	public void start() {
        System.out.println("Starting the electric motor of the Electric Car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Electric Car...");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the Electric Car...");
    }

	@Override
	public void CarKeys() {
		// TODO Auto-generated method stub
		
	}
}
