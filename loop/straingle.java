import java.util.*;
public class straingle
{
 public static void main(String[] args)
  {
   int i,j,n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value");
   n=sc.nextInt();
   int var=n;
   for(i=0;i<n;i++)
   {
   for(j=0;j<var;j++)
   {
   System.out.print("*");
   }
   var--;
   System.out.println();
   }
  }
}
   
