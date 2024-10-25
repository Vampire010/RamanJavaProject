package AbstractionExample;

public class ElectricCar extends Car
{
	@Override
    void start() {
        System.out.println("Starting the electric motor of the Electric Car...");
    }

    @Override
    void stop() {
        System.out.println("Stopping the Electric Car...");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating the Electric Car...");
    }
}
