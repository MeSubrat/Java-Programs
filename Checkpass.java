import java.util.Scanner;
class Checkpass
{
	
	public static void main(String []args)
	{
		String pass="Subrat";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter password");
		String user_pass=s.nextLine();
		if(user_pass.equals(pass)==true){
			System.out.println("Welcome");
		}else{
			System.out.println("Wrong pass");
		}
		//System.out.println(pass.equalsIgnoreCase(user_pass));
	}
}
		