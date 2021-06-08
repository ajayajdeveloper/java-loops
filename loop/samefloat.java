import java.util.*;
public class samefloat
{
 public static void main(String[] args)
 {
  double x,y;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the first float value");
  x=sc.nextDouble();
  System.out.print("enter the second");
  y=sc.nextDouble();
  
  x=Math.round(x*1000);
  x=x/1000;
  
  y=Math.round(y*1000);
  y=y/1000;
  
  if(x==y)
    {
      System.out.println("they are same");
    }
    else
     {
      System.out.println("they are diff");
      }
   }
}
  
