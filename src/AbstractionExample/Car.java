package AbstractionExample;

public abstract class Car 
{
	// Abstract Method
	    abstract void start();
	    abstract void stop();
	    abstract void accelerate();
	
}
/*
Real-Time Scenario: Car and Driver
Imagine you have a car and a driver:

The driver just needs to know how to operate the car, not how the car’s engine or transmission work.
When driving, the driver uses simple actions like pressing the accelerator, brake, or steering the wheel.
Here’s how this example fits with Java abstraction:

Car Class (Abstract Class): The car itself can be represented as an abstract class 
with abstract methods like start(), stop(), accelerate(), and brake(). 
These methods outline the actions a driver can perform on the car but do not specify how each action is carried out.

Specific Car Models (Concrete Classes): Each specific type of car, like a Sedan, SUV, or ElectricCar, can extend the abstract Car class. 
Each car model provides its unique implementation for start(), stop(), accelerate(), and brake(). For example:

A Sedan may start with a gas engine,
An ElectricCar may start with an electric motor.
Driver (Client): The driver only interacts with the Car class methods
and doesn’t care about the specific details of how each car starts or stops. The driver just calls car.start() and car.accelerate().
*/
