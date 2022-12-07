public class Account {
	long accNo;
	int password;
	double balance;
	public Account(long accNo, int password, double balance) {
		super();
		this.accNo = accNo;
		this.password = password;
		this.balance = balance;
	}
	public void accountDetails()
	{
		System.out.println(accNo);
		System.out.println(password);
		System.out.println(balance);
	}
}
