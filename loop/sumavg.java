import java.util.*;
public class sumavg
{
public static void main(String[] args)
{
int array[]=new int[5];

int sum=0 ,i;
System.out.print("enter the value:");
Scanner sc=new Scanner(System.in);
for (i=0;i<5;i++)
{
array[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println("value are:"+array[i]);
sum=sum+array[i];
}
System.out.println("ans is \n"+sum);
int avgs=sum/5;
System.out.println("avg is\n"+avgs);
}
}




