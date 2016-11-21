package bank.pk;

import java.util.Vector;

public class Account 														//class starts
{
	public String name;														//data member
	public int balance;														//data member
	public Vector<Transaction> trans=new Vector<>();						//vector
	public String creationDate;
	
	Account(String name)													//constructor starts
	{
		this.name=name;
		this.balance=2000;
	}																		//constructor ends
	
	public boolean checkTrans(Transaction t)								//checkTrans method starts
	{
		
		if(t.getAmount()<=this.balance && t.getAmount()>0)
			return true;
		else
			return false;
	}																		//checkTrans method ends
	
	public void postTrans(Transaction t)									//postTrans method starts
	{
		if(checkTrans(t))													//calling checkTrans method
		{
			trans.addElement(t);											//adding transaction object to the vector
			this.balance=this.balance-t.getAmount();
		}
		//else
			//System.out.println("Invalid Transaction.");
		
	}																		//postTrans method ends
	
	
}																			//class ends

