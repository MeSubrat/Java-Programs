import java.util.*;
class Checkno
{
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number to check for even or odd: ");
int num=in.nextInt();
if(num%2==0)
{
System.out.println("The number is even");
}
else
{
System.out.println("The number is odd");
}
}
}