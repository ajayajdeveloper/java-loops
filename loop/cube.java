import java.util.*;
public class cube
{
public static void main(String[] args)
{
int a,n,i;
System.out.println("enter the value");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(i=0;i<=n;i++)
{
a=i*i*i;

System.out.println("the value is"+a);
}
}
}
