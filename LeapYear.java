import java.util.Scanner;
class LeapYear
{

	public static void main (String [] args) 
{


Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int year=sc.nextInt();

if((year%400==0)||(year%4==0&&year%100!=0))
{
System.out.println("It is a leap year");
}
else
{
System.out.println("It isn't leap year");
}
}
}



