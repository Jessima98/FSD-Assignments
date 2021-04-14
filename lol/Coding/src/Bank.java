interface Account
{
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount);
}
class HDFCAccount implements Account
{
	double deposit;
	double withdrawals;
	public double getBalance()
	{
		System.out.println("Fetching Balance....");
		return deposit-withdrawals;
		
	}
	public void deposit(double amount)
	{
		deposit=deposit+amount;
		System.out.println("Deposit....."+ deposit);
	}
	public void withdraw(double amount)
	{
		withdrawals=withdrawals+amount;
		System.out.println("Withdrawals....."+withdrawals);
	}
}
class SBIAccount implements Account
{
	double deposit;
	double withdrawals;
	public double getBalance()
	{
		System.out.println("Fetching Balance....");
		return deposit-withdrawals;
		
	}
	public void deposit(double amount)
	{
		deposit=deposit+amount;
		System.out.println("Deposit....."+ deposit);
	}
	public void withdraw(double amount)
	{
		withdrawals=withdrawals+amount;
		System.out.println("Withdrawals....."+withdrawals);
	}
}
public class Bank {
public static void main(String[] args)
{
	HDFCAccount obj=new HDFCAccount();
	SBIAccount obj1=new SBIAccount();
	System.out.println("HDFC ACCOUNT DETAILS:");
	obj.deposit(1000.0);
	obj.withdraw(500.0);
	System.out.println(obj.getBalance());
	System.out.println("-------------------------------------");
	System.out.println("SBI ACCOUNT DETAILS:");
	obj1.deposit(2000.0);
	obj1.withdraw(1000.0);
	System.out.println(obj1.getBalance());
}
}
