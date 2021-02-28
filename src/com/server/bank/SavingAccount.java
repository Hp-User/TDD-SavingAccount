package com.server.bank;

public class SavingAccount {
	
	private int balance;

	public void deposit(int amount) {	
		if(amount < 0 )
			throw new NegativeDepositException();
		balance+= amount;	
		 
	} 
	
	private void update()
	{
		System.out.println("Account update private");
	}
	
	/*public int  getClients()
	{
		System.out.println("Account getClients ");
		return 4;
	}*/
	
	
   public void deposit(Currency currency) {	
	    
		double amount = currency.getRupeesConvresionRate() * currency.getCurrencyValue();
		balance+= amount+1;		
		 
	}

	  public int  getBalance()
        {
            /*if (balance < 0)
                balance = 0;*/
            return balance;
        }	 	
 
	public SavingAccount(int amount)
    {
        this.balance = amount;
    }
    //default constructor
    public SavingAccount()
    {
       // this.balance =1000;
    } 
    public void withdraw(int amount)
    {      
        if(amount  >  balance )
        { 
           throw new WithDrawAmountMoreThanBalance("More amount withdrawn");
        }
                	
      	 //obvious implementation
    	  balance-= amount;
    	 
    }


}
