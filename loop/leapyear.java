import java.util.*;
public class leapyear
{
 public static void main(String[] args)
 {
  int n;
  System.out.print("enter the year:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  
   if(n%4==0 && n%100!=0)
    {
     System.out.println("it is leap year");
    }
    else 
     {
      System.out.println("it is not a leap year");
     }
    
   }
}
  
  
