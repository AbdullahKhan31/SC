package bank.pk;

import java.util.Date;

public class Banking 										
{																				//class starts

	public static void main(String[] args) 										//main method starts
	{
		AccountPlus ashar=new AccountPlus("Ashar",800);							//AccountPlus Object
		Account kamran=new Account("Kamran");									//Account Object
		Bank b=new Bank();	
		b.list.add(ashar);
		b.list.add(kamran);
		ashar.creationDate="07/24/2016";
		kamran.creationDate="05/24/2016";
		ashar.postTrans(new Transaction(new Date(),900));
		ashar.postTrans(new Transaction(new Date(),100));
		kamran.postTrans(new Transaction(new Date(),700));
		kamran.postTrans(new Transaction(new Date(),200));
		
		int i=0;																//loop counter
		
		for (Account h:b.list)
		{																		//accounts for each loop starts
			System.out.println();
			b.chargeMonthlyFee(h);
			System.out.println("Account Holder: "+h.name);
			System.out.println("Account Balance: "+h.balance);
			i=0;
			System.out.println();
		
			for (Transaction o : h.trans) 
			{																	//transaction for each loop starts
				i++;
				System.out.println("\nTransaction # "+i);
				System.out.println("Amount Withdrawn: "+o.getAmount());
				System.out.println("Withdrawal Date: "+o.getDate());	
				System.out.println("________________________________________________________");

			}																	//transaction for each loop ends
			
		}																		//accounts for each loop ends
		
		
	}																			//main method ends

}																				//class ends

