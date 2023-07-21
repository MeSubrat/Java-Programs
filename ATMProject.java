import java.util.Scanner;
class ATMProject
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("1.LogIn\n2.Show Balance\n3.Exit");
		System.out.print("Enter choice: ");
		int op=s.nextInt();
		double balance=0;
		if(op==1)
		{
			System.out.print("Enter pin: ");
			int userpin=s.nextInt();
			while(userpin==9861)
			//while(true)
			{
				//System.out.println("\tCONGRATULATIONS");
				System.out.println("1.Show Balance\n2.Withdraw\n3.Deposite\n4.Exit");
				int choice=s.nextInt();
				switch(choice)
				{
					case 1: System.out.println("Balance: "+balance);
							break;
					case 2: System.out.print("Enter amount to withdraw: ");
							double wamount=s.nextDouble();
							//withdraw(wamount);
							if(wamount<=balance)
							{
								System.out.println("Transactioon Successful");
								balance=balance-wamount;
								System.out.println("Remaining Balance: "+balance);
							}
							else
							{
								System.out.println("Insufficient Balance");
							}
							break;
					case 3: System.out.print("Enter amount to Deposite: ");
							double damount=s.nextDouble();
							System.out.println("Transactioon Successful");
							balance=balance+damount;
							System.out.println("Remaining Balance: "+balance);
							break;
					case 4: System.exit(0);
							break;
					default: System.out.println("Enter a valid choice");
							break;
				}
			}
			if(userpin!=9861)
			{
				System.out.println("Wrong Pin entered, program terminated");
			}
		}
		else if(op==2)
		{
			System.out.println("Balance: "+balance);
		}
		else if(op==3)
		{
			System.out.println("Thank You");
			System.exit(0);
		}
	}
}