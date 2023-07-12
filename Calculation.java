import java.util.*;
class Calculation
{
public static void main(String [] args)
{
//Input
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the mass(In grams)");
float mass=Sc.nextFloat();
System.out.println("Enter the velocity(In m/s)");
float velocity=Sc.nextFloat();
System.out.println("Enter the time(In seconds)");
float time=Sc.nextFloat();
//Logic
float acceleration=velocity/time;
float Force=mass*acceleration;
System.out.println("The accelearation= "+acceleration);
System.out.println("The force= "+Force);
}
}