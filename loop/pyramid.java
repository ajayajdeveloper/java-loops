import java.util.*;
public class pyramid
{
 public static void main(String[] args)
 {
  int i,j,n,k;
  System.out.print("input number of rows:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int space=n-1;
  for(i=1;i<=n;i++)
  {
    for(k=0;k<space;k++)
    {
    System.out.print(" ");
   
    }
       space--;
       for(j=1;j<=i;j++)
       {
          System.out.print(i+" ");
          
        }
        System.out.println();
     }
 }
}
 
