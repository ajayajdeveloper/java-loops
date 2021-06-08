import java.util.*;
public class quad
{
public static void main(String[] args)
{
int a,b,c;
double rot1,rot2;
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
a=sc.nextInt();
System.out.println("enter b");
b=sc.nextInt();
System.out.println("enter c");
c=sc.nextInt();
double det=(b*b)-4*a*c;
if(det>0)
{
rot1=(-b + Math.sqrt(det))/(2*a);
rot2=(-b - Math.sqrt(det))/(2*a);
System.out.println("rot1"+rot1+"and rot2"+rot2);
}
else if(det==0)
{
rot1=rot2=-b/(2*a);
System.out.println("rot1"+rot1+"and rot2"+rot2);
}
else
{
rot1=rot2=-b/(2*a);
System.out.println("rot1"+rot1+"and rot2"+rot2);
}}}
