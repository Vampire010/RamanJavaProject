package ControlStatements;

public class Food 
{
	
	public void orderFood(String name)
	{
      switch(name)
       {
      
       case "Pizza":
    	    System.out.println("Order Pizza");
            break;
       case "Burger":
    	    System.out.println("Order Burger");
            break;
       case "Fries":
    	    System.out.println("Order Fries");
            break;
       default:
        	System.out.println("Invalid Order");
            break;
       }
    }

	public static void main(String[] args) 
	{
		Food food = new Food();
		food.orderFood("Pizza");
		/*food.orderFood("Burger");
		food.orderFood("Fries");
		food.orderFood("Coke"); */

	}

}
