import java.util.*;
public class multable
{
public static void main(String[] args)
{
int i,j,n;
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
j=n*i;
System.out.println(n+"x"+i+"="+j);
}
}
}
