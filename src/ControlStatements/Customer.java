package ControlStatements;

public class Customer
{
	static String CustomerType1="Regualr";
	static String CustomerType2="Premium";
	static String CustomerType3="Guest";
	double regualrDiscount = 5;
	double premiumDiscount = 10;
	double guestDiscount = 0;
    double taxPercent = 5;
	double packageCharges = 10;
	
	public void finalBill(int totalAmount,String customerType)
	{
		
		
		//if(num1>num2)
		//if(value==true)
		if(customerType.equals("Regualr"))
		{
			double discount = (totalAmount * regualrDiscount)/100; 
			double DiscountTotal = totalAmount - discount;
			System.out.println("Total Amount: "+totalAmount);
			System.out.println("Final Bill after discount: "+DiscountTotal);
			if(DiscountTotal>=1000)
			{
				System.out.println("Congratulations! You get a rewardPoints");
				rewardPoints(DiscountTotal);;
			}
			else
			{				
				System.out.println("You do not get a rewardPoints as you have DiscountTotal less than 1000");
			}
		}
		else if(customerType.equals("Premium"))
		{
			double discount = (totalAmount * premiumDiscount)/100; 
			double DiscountTotal = totalAmount - discount;
			System.out.println("Total Amount: "+totalAmount);
			System.out.println("Final Bill after discount: "+DiscountTotal);
			rewardPoints(DiscountTotal);
		}
		else if(customerType.equals("Guest"))
		{
			double discount = (totalAmount * guestDiscount)/100; 
			double DiscountTotal = totalAmount - discount;
			
			double tax = (totalAmount * taxPercent)/100; 
			
			double totalWithTax = DiscountTotal + tax + packageCharges;

			System.out.println("Total Amount without tax: "+DiscountTotal);
			
			System.out.println("Final Bill with Tax: "+totalWithTax);
		}
		else
		{	
			System.out.println("Invalid Customer Type");
		}
	}
	
	public void rewardPoints(double DiscountTotal)
	{
		double rewardPoints = DiscountTotal * 0.1;
        System.out.println("Reward Points: "+rewardPoints);
	}
	
	public static void totot()
	{
		System.out.println("Im a Static Method");
	}
	
	public static void main(String[] args) 
	{
		Customer customer = new Customer();
		System.out.println("#####################Regular Customer################################");
		customer.finalBill(100,CustomerType1);
		System.out.println("#####################Regular Customer################################");
		customer.finalBill(1400,CustomerType1);
		System.out.println("#####################premium Customer###############################");
		customer.finalBill(150,CustomerType2);
		System.out.println("######################Guest Customer###############################");
		customer.finalBill(200,CustomerType3);
		System.out.println("######################################################################");
		
		//Customer.totot();

		
	}

}
