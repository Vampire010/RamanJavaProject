package XoXoHotel;

public class Customer 
{
	private String Custname;
	private String Custid;
	private double Bill;
	private long contactnumber;
	
	//Constructer
	/*public Customer()
	{
		System.out.println("*****************************Non Parametraized***********************************");

	}
	
	public Customer(int custid, String custname, String cust)
	{
		System.out.println("*****************************Parametraized***********************************");
	}*/
	
	public String getCustname()
	{
		return Custname;
	}
	public void setCustname(String custname) 
	{
		Custname = custname;
	}
	public String getCustid() 
	{
		return Custid;
	}
	public void setCustid(String custid) 
	{
		Custid = custid;
	}
	public double getBill() 
	{
		return Bill;
	}
	public void setBill(double bill) 
	{
		Bill = bill;
	}
	public long getContactnumber() 
	{
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) 
	{
		this.contactnumber = contactnumber;
	}

	public void customerDetails()
	{		
		System.out.println("Customer Name: " + getCustname());
		System.out.println("Customer ID: " + getCustid());
		System.out.println("Bill Amount: " + getBill());
		System.out.println("Contact Number: " + getContactnumber());	
	}
	
	public void updateCustomerDetails(String customerName)
	{
		setCustname(customerName);
		System.out.println("Customer Details Updated Successfully.");
		System.out.println("Updated Customer Name: " + getCustname());
	
	}
	
	public void updateCustomerDetails(long contactnumber)
	{
		setContactnumber(contactnumber);
		System.out.println("Customer Details Updated Successfully.");
		System.out.println("Updated Contact Number: " + getContactnumber());	
		
	}
	
}
