//JAVA PROGRAM TO PRINT ASCII VALUE FROM (a-z)..
import java.util.Scanner;
class ASCIIValue
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		char ch='a';
		int ascii=(int)ch;
		do
		{
			System.out.println(ch+" : "+ascii);
			ch++;
			ascii++;
		}while(ch<='z' && ascii<=(int)'z');
	}
}