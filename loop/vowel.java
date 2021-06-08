import java.util.*;
public class vowel 
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
String s;
System.out.println("enter the alphabet");
s=sc.next();
if(s.length()==1)
{
if(s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u"))
{
System.out.println("it is vowel");
}
else
System.out.println("it is consonent");
}
else
System.out.println("it is error");
}
}
