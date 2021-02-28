package com.server.test;

//import junit.framework.Assert;


//New assert with static methods
import static org.junit.Assert.*;

//Multiple 

import org.junit.Test;

import com.server.bank.SavingAccount;

import com.server.bank.NegativeDepositException;

//import com.server.bank.SavingAccount;

public class TestSavingAccount2 {
	
	public TestSavingAccount2()
	{
		System.out.println("TestSavingAccount2.constructor..");
		// obj = new SavingAccount();
	}
	
	@Test(expected=com.server.bank.NegativeDepositException.class)
	public void testAccountNegativeDeposit()
	{
		SavingAccount obj = new SavingAccount();
		obj.deposit(-1000);
		 
		int amount = obj.getBalance();
		assertEquals(0, amount);
	}	 
	@Test
	public void VerifySavingAccountNegativeBalanceDeposit()
    {
		SavingAccount obj = new SavingAccount(-100);
        obj.deposit(2000);
        int amount = obj.getBalance();
        assertEquals(1900, amount);
    }
	@Test
	public void TestSavingAccountWithdraw()
    {
		SavingAccount obj = new SavingAccount(2000);
        obj.withdraw(1000);  //Compiler Error..Fix It!
        int amount = obj.getBalance();
        assertEquals(1000, amount);
    }
	
	@Test
	public void TestSavingAccountDepositAndWithdraw()
    {
		SavingAccount obj = new SavingAccount();
        obj.deposit(2000);
        
        obj.withdraw(1000);

        int amount = obj.getBalance();
        assertEquals(1000, amount);
    }
	
	 
			@Test(expected=com.server.bank.WithDrawAmountMoreThanBalance.class)
		    public void TestSavingAccountWithdrawMoreAmount()
		         {
				    SavingAccount obj = new SavingAccount();
				
		             obj.deposit(1000);

		             obj.withdraw(3000);

		             int amount = obj.getBalance();

		             assertEquals(2000, amount);
		         }





	


}
