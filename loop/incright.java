import java.util.*;
public class incright
 {
 public static void main(String[] args)
  {
    int i,j,n,z=1;
    System.out.print("enter the number of row");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    
    for(i=1;i<=n;i++)
    {
    for(j=0;j<i;j++)
    System.out.print(z++);
    System.out.println(" ");
    }
   }
  }
    
 
    
    
