import java.util.*;
public class compare
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the floating point");
a=sc.nextInt();
b=sc.nextInt();
a=Math.round(a*1000);
a=a/1000;
b=Math.round(b*1000);
b=b/1000;
if(a==b)
System.out.println("they are same");
else
System.out.println("they are diff");
}}

