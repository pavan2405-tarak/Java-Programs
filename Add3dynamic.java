import java.util.Scanner;
class Add3dynamic
{
public static void main(String args[])
{
int a,b,c,d;
Scanner scan=new Scanner(System.in);
System.out.println("enter a value :");
a=scan.nextInt();
System.out.println("enter b value :");
b=scan.nextInt();
System.out.println("enter c value :");
c=scan.nextInt();
d=a+b+c;
System.out.println("Additions of three values are :"+d);
}
}