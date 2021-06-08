import java.util.Scanner;
public class dd 
 {
  public static void main(String[] args)
  {
    int i,j,n;
    System.out.print("Input number of rows: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=0;i<=n;i++)
   {
     for(j=1;j<=n-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
     System.out.print("*");
     
     System.out.print("\n");
   }
 
    for(i=n-1;i>=1;i--)
   {
     for(j=1;j<=n-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
     System.out.print("*");
     
     System.out.print("\n");
   }
 
  }
}

