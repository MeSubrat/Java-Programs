import java.util.Scanner;
class CheckVowel
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character to check Vowel");
		char op=s.next().charAt(0);
		if(op=='a' || op=='e' || op=='i' || op=='o' || op=='u')
		{
			System.out.println(op+" is Vowel");
		}
		else
		{
			System.out.println(op+" is consonant");
		}
	}
}