package XoXoHotel;

public class BillCounter
{

	public static void main(String[] args) 
	{
		System.out.println("*************************customer***************************************");
		Customer customer = new Customer("John","1234567890",9876543210L);
		
		/*customer.setCustname("John");
		customer.setCustid("1234567890");
		customer.setBill(1500);
		customer.setContactnumber(9876543210L);	
		customer.customerDetails();*/
		
		System.out.println("*****************************regularcustomer***********************************");
		RegularCustomer regularcustomer = new RegularCustomer("Smith","1111222200",9999888844L);
		
		/*regularcustomer.setCustname("Smith");
		regularcustomer.setCustid("9874563210");
		regularcustomer.setBill(7800.30);
		regularcustomer.setContactnumber(9999444400L);		
		regularcustomer.customerDetails();
		System.out.println("****************************premiumCustomer************************************");
		PremiumCustomer premiumCustomer = new PremiumCustomer();
		premiumCustomer.setCustname("John Smith");
		premiumCustomer.setCustid("9874563210");
		premiumCustomer.setBill(7800.30);
		premiumCustomer.setContactnumber(9999444400L);		
		premiumCustomer.customerDetails();
		System.out.println("****************************************************************");*/

	}

}
