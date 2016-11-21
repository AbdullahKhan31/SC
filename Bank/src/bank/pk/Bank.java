package bank.pk;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bank 
{
	ArrayList<Account> list = new ArrayList<Account>();
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

	void chargeMonthlyFee(Account account)											//chargeMonthlyFee method 
	{
		String createdDate = (account.creationDate); 
		String currentDate = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		Date d1 = null;
		Date d2 = null;	
		 
		try 
		{																			//try block starts
		    d1 = format.parse(createdDate);
		    d2 = format.parse(currentDate);
	
		    long diff = d2.getTime() - d1.getTime();								//difference in milliseconds
		    long diffDays = diff / (24 * 60 * 60 * 1000);
		    int num=0;																//months multiplier
		    if(diffDays> 31)
		    {
		    	num=(int) (diffDays/31);
		    	account.balance = account.balance - (100*num);
		    }
		    	 
		    System.out.println("Account created "+num+ " months ago. ");
		     
		} 																			//try block ends
		
		catch (Exception e) 
		{																			//catch block starts
		    e.printStackTrace();
		}																			//catch block ends
		
	}																				//chargeMonthlyFee method ends
	
}																					//class ends
