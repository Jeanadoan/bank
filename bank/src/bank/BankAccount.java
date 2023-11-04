package bank;

public class BankAccount {

	//Attributes
	
	int AccountNumber;
	double Balance;
	private int Deposit;

	
	
	//constructor
	
	public BankAccount (int AccountNum) {
		this.AccountNumber= AccountNum ;
		this.Balance =0.0;
		
		
	}
	
	public void Deposit (double amount) {
		if (amount>0) {
			Balance += amount ;
			System.out.println ("Deposited $"+ amount + " into account: " + AccountNumber); 
			
		}
		else {
			System.out.println ("You can not deposit less than $1");
		}
		
	}
	public void Withdraw (double amount) {
	if (amount>0) {
		if (amount<=Balance) {
			Balance-=amount;
			System.out.println ("Withdrew $"+ amount + " from account: " + AccountNumber);
			
		}
		else {
			System.out.println ("Insufficient Balance");
		}
		}
	else {
		System.out.println ("You can not withdraw less than $1");
	}
	}
	public double GetBalance () {
		return Balance;
	}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount (001);
		BankAccount account2 = new BankAccount (002);
		account1.Deposit (5.5);
		account1.Withdraw (7.3);
		System.out.println ("Your account balance is $"+account1.GetBalance ());
		System.out.println (" ");
		account2.Deposit (10.0);
		account2.Deposit (4.3);
		System.out.println ("Your account balance is $"+account2.GetBalance ());
	}

}
