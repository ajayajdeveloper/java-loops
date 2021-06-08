import java.util.*;
public class at
{
  public static void main(String[] args)
  {
  int i,j,n;
  System.out.print("enter the number:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  
  for(i=1;i<=n;i++)
   {
    for(j=0;j<i;j++)
    System.out.print("@");
    
    System.out.print("\n");
    }
   }
}
  
