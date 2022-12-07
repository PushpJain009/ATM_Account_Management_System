import java.util.Scanner;
public class IciciDriver {
	public static void main(String[] args) {
		Icici i = new Icici();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while(exit)
		{
			System.out.println("Enter your choice \n1.Create Account \n2.Withdraw Amount \n3.Deposite Amount \n4.Check Balance \n5.Change Password \n6.Deactivate Account \n7.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Give your account number ");
				long accNo = sc.nextLong();
				System.out.println("Give your password");
				int password = sc.nextInt();
				System.out.println("Give your balance");
				double balance = sc.nextDouble();
				i.createAccount(new Account(accNo, password, balance));
			}
			break;
			case 2:
			{ if(i.a!=null)
			{
				
				System.out.println("Enter your password");
				int password = sc.nextInt();
				System.out.println("Enter the amount you want to withdraw");
				double balance = sc.nextDouble();
				i.withdraw(password, balance);
			}
			else
			{
			System.out.println("No account is created to withdraw");
			}
			}
			break;
			case 3:
			{
				if(i.a!=null)
				{
				System.out.println("Enter your password");
				int password = sc.nextInt();
				System.out.println("Enter the amount you want to deposite");
				double amount = sc.nextDouble();
				i.deposite(password, amount);
				}
				else
				{
				System.out.println("No account is created to deposite");
				}
			}
			break;
			case 4:
			{
				if(i.a!=null)
				{
				System.out.println("Enter your password");
				int password = sc.nextInt();
				i.balanceEnquiry(password);
				}
				else
				{
					System.out.println("No account is created to check balance");
				}
			}
			break;
			case 5:
			{
				if(i.a!=null)
				{
				System.out.println("Enter your old password");
				int oldPassword = sc.nextInt();
				System.out.println("Enter your new password");
				int newPassword = sc.nextInt();
				i.changePassword(oldPassword, newPassword);
				}
				else
				{
				System.out.println("No account is created to change password");
				}
			}
			break;
			case 6:
			{
				if(i.a!=null)
				{
					System.out.println("Enter your password");
					int password = sc.nextInt();
				    i.deactivateAccount(password);
				}
				else
				{
				System.out.println("No account is created to deactivate");
				}
			}
			break;
			case 7:
			{
				exit = false;
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
		}
		}
		
	}

}
