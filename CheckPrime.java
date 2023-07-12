import java.util.*;
class CheckPrime
{
    public static void main(String [] args)
    {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number to check prime");
	int num=S.nextInt();
	int count=0;
	for(int i=1;i<=num;i++)
	{
	    if(num%i==0){
		count++;
}
	}
	if(count==2){
	    System.out.println("The number is prime");
        }else{
	    System.out.println("The number is not prime");
	}
    }
}