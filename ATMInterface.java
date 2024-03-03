import java.util.Scanner;
interface ATM
{
	public void withdraw(int amount);
	public void deposit(int amount);
	public void checkBalance();
}
class UserAccount implements ATM
{
	int bank_blnc;
	public void withdraw(int amount)
	{
		if(amount <= bank_blnc)
		{
			bank_blnc-=amount;
			System.out.println("\tWithdrawl Successful\t\n");
		}
		else
		{
			System.out.println("\tSorry You Dont have sufficient amount!!\t\n");
		}
	}
	public void deposit(int amount)
	{
		bank_blnc+=amount;
		System.out.println("\tDeposit Successful\t\n");
	}
	public void checkBalance()
	{
		System.out.println("\t Your balance : "+bank_blnc+"\n");
	}
}
class ATMInterface 
{
	public static void main(String args[])
	{
		UserAccount u1 = new UserAccount();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("\t\t\tWelcome To The ATM");
		System.out.println("\tChoose An Option");
		System.out.println("\t1.Withdraw\t2.Deposit\t3.CheckBalance\n");
		int option = sc.nextInt();
		switch(option)
		{
			case 1:
				System.out.print("\tEnter Amount to Withdraw : ");
				int withdrw_amnt = sc.nextInt();
				u1.withdraw(withdrw_amnt);
				break;
			case 2:
				System.out.print("\tEnter Amount to deposit : ");
				int deposit_amnt = sc.nextInt();
				u1.deposit(deposit_amnt);
				break;
			case 3:
				u1.checkBalance();
				break;
			default:
				System.out.println("Choose the Right Option");
				break;
		}
		}
	}
}