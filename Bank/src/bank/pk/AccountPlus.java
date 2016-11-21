package bank.pk;

public class AccountPlus extends Account
{																			//class starts
	public int limit;
	AccountPlus(String name,int limit)										//constructor starts
	{
		super(name);
		this.limit=limit;
	}																		//constructor ends
	public boolean checkTrans(Transaction t)								//checkTrans method starts
	{
		
		if(t.getAmount()<=super.balance && super.balance-t.getAmount()>this.limit && t.getAmount()>=0)
			return true;
		else
			return false;
	}																		//checkTrans method ends

}																			//class ends

