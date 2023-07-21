//PALINDROME NUMBER IN A GIVEN RANGE
import java.util.Scanner;
class PalindromeInARange
{
	public boolean checkPalindrome(int n)
	{
		int temp=n;
		int digits=0;
		int rev=0;
		int count=0;
		while(temp>0)
		{
			digits=temp%10;
			rev=(rev*10)+digits;
			temp=temp/10;
			count++;
			//return rev;
		}
		if(count>=3)
		{
			if(rev==n)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter initial range: ");
		int range1=s.nextInt();
		System.out.print("Enter final range: ");
		int range2=s.nextInt();
		PalindromeInARange obj=new PalindromeInARange();
		for(int i=range1;i<=range2;i++)
		{
			if(obj.checkPalindrome(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}