import java.util.*;
public class month
{
public static void main(String[] args)
{ 
int m,yr;
Scanner sc=new Scanner(System.in);
System.out.println("enter the month");
m=sc.nextInt();
System.out.println("enter the year");
yr=sc.nextInt();
if(m==1)
System.out.println(" jan has 31 days");
else if(m==2)
{
if(yr%4==0)
System.out.println("feb has 29 days");
else
System.out.println("feb has 28 days");
}
else if(m==3)
System.out.println("march has 31 days");
else if(m==4)
System.out.println("april has 30 days");
else if(m==5)
System.out.println("may has 31 days");
else if(m==6)
System.out.println("june has 30 days");
else if(m==7)
System.out.println("july has 31 days");
else if(m==8)
System.out.println("augest has 31 day");
else if(m==9)
System.out.println("sept has 30 days");
else if(m==10)
System.out.println("oct has 31 days");
else if(m==11)
System.out.println("nov has 30 days ");
else if(m==12)
System.out.println("dec has 31 days");
}}








