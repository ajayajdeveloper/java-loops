import java.util.*;
public class ddfloat
{
 public static void main(String[] args)
 {
  double num1,num2;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the first float value");
  num1=sc.nextDouble();
  System.out.print("enter the second");
  num2=sc.nextDouble();
  
  if(Math.abs(num1-num2)<0.01)
    {
     System.out.println("they are same");
    }
     
     else
      {
        System.out.println("they are diff");
      }
    }
}
  
 
