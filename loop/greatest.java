import java.util.*;
public class greatest
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
System.out.println("first number is greatest");
else if(b>a && b>c)
System.out.println("second number is greatest");
else if(c>a && c>b)
System.out.println("third number is greatest");
}}
