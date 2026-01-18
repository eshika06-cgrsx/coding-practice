import java.util.Scanner;
class LargestNo
{
public static void main(String[] args)
{
Scanner sc= new Scanner (System.in);
System.out.println("a value");
int a= sc.nextInt();
System.out.println("b value");
int b= sc.nextInt();
System.out.println("c value");
int c= sc.nextInt();

if(a==b&&b==c)
{
 System.out.println("all equal");
}
else if (a>b&&a>c) {
System.out.println("a is greater" +a);
}
else if (b>a&&b>c) 
{
System.out.println("b is greater "+b);
}
else
System.out.println("c is greater" + c);
}
}
