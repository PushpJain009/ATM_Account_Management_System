public abstract class Atm {
	//Abstract method
public abstract void withdraw(int password,double amount);
public abstract void deposite(int password,double amount);
public abstract void balanceEnquiry(int password);
public abstract void changePassword(int oldPassword,int newPassword);
}