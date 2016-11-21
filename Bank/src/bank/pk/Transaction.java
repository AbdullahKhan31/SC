package bank.pk;

import java.util.Date;

public class Transaction 										//class starts
{
	private int amount;											//data member
	private Date date;											//data member
	
	Transaction(Date d,int a)									//constructor starts
	{
		this.amount=a;
		this.date=new Date();
	}															//constructor ends
	
	public int getAmount()										//getter for amount starts
	{
		return this.amount;
	}															//getter for amount ends
	
	public Date getDate()										//getter for date starts
	{	
		return this.date;
	}															//getter for date starts

	
}																//class ends

