public class Icici extends Atm {
	Account a;
	public void createAccount(Account a)
	{
		if(this.a==null)
		{
			this.a=a;
			System.out.println("Account is  created successfully ");
		}
		else
		{
			System.out.println("Account is already present");
		}
	}
	@Override
	public void withdraw(int password, double amount) {
		if(this.a!=null)
		{
			if(a.password==password)
			{
				a.balance=a.balance-amount;
				System.out.println(amount+" is withdrawn");
				System.out.println("Balance is "+a.balance);
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("No account is  created to withdraw");
		}
		
	}
	@Override
	public void deposite(int password,double amount) {
		if(this.a!=null)
		{
			if(a.password==password)
			{
				a.balance=a.balance+amount;
				System.out.println(amount+" is deposited");
				System.out.println("Balance is "+a.balance);
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
		   System.out.println("No account is created to deposite");
		}
		
	}
	@Override
	public void balanceEnquiry(int password) {
		if(this.a!=null)
		{
			if(a.password==password)
			{
				System.out.println("Balance is "+a.balance);
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		else
		{
			System.out.println("No account is created to show balance");
		}
		
	}
	@Override
	public void changePassword(int oldPassword, int newPassword) {
		if(this.a!=null)
		{
			if(a.password==oldPassword)
			{
				a.password=newPassword;
				System.out.println("Password has been changed successfully");
			}
			else
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("No account is created to change password");
		}
		
	}
	public void deactivateAccount(int password)
	{
		if(this.a!=null)
		{
			if(a.password==password)
			{
			this.a=null;
			System.out.println("Account is deactivated");
			}
			else
			{
				System.out.println("Password is not matching");
			}
		}
		else
		{
			System.out.println("No account is created to deactivate");
		}
	}
}
