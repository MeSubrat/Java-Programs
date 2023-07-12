//Password=2222;
import java.util.Scanner;
class Login{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the password");
int pass=s.nextInt();
if(pass==2222){
System.out.println("Welcome");
}else{
System.out.println("Enter the password again");
}

}
}