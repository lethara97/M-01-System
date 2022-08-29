package Account;

public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) 
	{
		this.name= name;
		
		if(balance > 0) 
		{
			this.balance= balance;
		}
	}
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0.0)
		{
			balance = balance + depositAmount;
		}
	}
	public double getBalance()
	{
	return balance;
	}
	// method that sets the name
	public void setName(String name)
	{
	this.name = name;
	}
	public String getName()
	{
		return name; // give value of name back to caller
	}

}
