import java.util.*;
class SimpleInterest
{	
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		float principle;
		float time;
		float roi;
		float si;
		int n;
		do
		{
			System.out.println("Enter the Choice below");
			System.out.println("Do you want to calculate SI\n1.Yes\n2.No");
			System.out.print("Your ans:");
			n=s.nextInt();
			if(n==1)
			{
				System.out.print("Enter Principle amount: ");
				principle=s.nextFloat();
				System.out.print("Enter Time: ");
				time=s.nextFloat();
				System.out.print("Enter Rate of interest:");
				roi=s.nextFloat();
				si=(principle*time*roi)/100;
				System.out.println("Simple Interest is: "+si);
			}
			else if(n==2)
			{
				System.out.println("Thank You");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Option");
			}
		}while(n==1);
		
	}

}