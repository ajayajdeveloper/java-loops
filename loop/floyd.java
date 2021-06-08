import java.util.*;
public class floyd
{
 public static void main(String[] args)
 {
  int i,j,n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for(i=1;i<=n;i++)
   {
   for(j=0;j<i;j++)
   {
   if( ( (i%2)==0 && (j%2)==0 ) ||( (i%2)!=0 && (j%2)!=0 ) )
   System.out.print("1");
   else
   System.out.print("0");
   }
   System.out.println("");
   }
  }
}
  
