import java.util.Scanner;
class Starprint
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row=s.nextInt();
		for(int i=0;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
