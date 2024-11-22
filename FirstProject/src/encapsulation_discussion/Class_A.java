package encapsulation_discussion;

public class Class_A
{
	// Bank Account
	
	private int accBal = 1000;
	
	
	/**
	 * to get the balance of account
	 */
	public int getBalance()
	{	
		return accBal;
	}
	
	
	public void withdraw(int amountToWinthDraw)
	{
		
		accBal  = accBal - amountToWinthDraw;
		
		getBalance();
		
	}
	
	// abstraction 
	
	
	
	
	
	
}
