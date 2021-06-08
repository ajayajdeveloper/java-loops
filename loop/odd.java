import java.util.*;
public class odd
{
   public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int val=1;
    int sum=0;
    for(int i=0;i<n;i++)
    {
    System.out.println(val+" ");
    sum=sum+val;
    val=val+2;
    }
    System.out.println("sum:"+sum);
  }
 }


