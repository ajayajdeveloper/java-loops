import java.util.*;
public class digits 
{
 public static void main(String[] args)
 {
   int count=0,n;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   
   while(n>0)
   {
     count++;
     n=n/10;
    }
    System.out.println("number of digits"+count);
   }
 }
 
