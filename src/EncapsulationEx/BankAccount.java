package EncapsulationEx;

public class BankAccount 
{
	// Encapsulation
	private String accountNumber;
	private double balance;
	
	public void UserBankAccount(String AccntNumber, double Accntbalance )
	{
		this.accountNumber=AccntNumber;
		this.balance=Accntbalance;		
	}
	
	public void deposit(double depositAmount)
	{
		
		if(depositAmount>0)
		{
			balance += depositAmount;
		}
	}
	
	public void withdraw(double WithdrawAmount)
	{
		
		if(WithdrawAmount>0 && WithdrawAmount<=balance )
		{
			balance -= WithdrawAmount;
		}
	}
	
	public String getBalance()
	{		
		return "Account Balnace of an "+accountNumber+" : "+ balance;
	}

}
