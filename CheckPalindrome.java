import java.util.Scanner;
class CheckPalindrome{
	public static void main(String [] args){
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=n.nextInt();
		int rev=0;
		int digit;
		int temp=num;
		while(temp>0){
			digit=temp%10;
			rev=(rev*10)+digit;
			temp=temp/10;
		}
		if(num==rev){
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not a Palindrome number");
		}
	}
}