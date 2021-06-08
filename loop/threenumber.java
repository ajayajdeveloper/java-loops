import java.util.*;
public class threenumber
{
 public static void main(String[] args)
 {
 int x,y,z;
 Scanner sc=new Scanner(System.in);
 
 System.out.print("enter the first number");
 x=sc.nextInt();
 System.out.print("enter the second number");
 y=sc.nextInt();
 System.out.print("enter the third number");
 z=sc.nextInt();
 
 if(x<y && y<z)
 {
   System.out.println("increasing");
  }
  else if(x>y && y>z)
  {
  System.out.println("decreasing");
  }
  else
  {
  System.out.println("increasing r decreasing");
  }
 }
}
 
 
