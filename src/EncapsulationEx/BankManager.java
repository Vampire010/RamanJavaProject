package EncapsulationEx;

public class BankManager 
{

	public static void main(String[] args) 
	{
		 BankAccount account = new BankAccount();
		 account.UserBankAccount("XYZ1234567890", 4000.53);
	    System.out.println("Before Deposit Balance: " + account.getBalance());
	    
        account.deposit(500);
	    System.out.println("After Deposit Balance: " + account.getBalance());

        account.withdraw(200);
	    System.out.println("After withdraw Balance: " + account.getBalance());
	    
	    
        
        
	}

}
