import java.util.*;
public class check
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
 
 if(x==y && x==z)
 {
   System.out.println("all are equal");
  }
  else if((x==y) || (x==z) || (z==y))
  {
  System.out.println("neither all are or diff");
  }
  else
  {
  System.out.println("all are diff");
  }
 }
}
 
 
