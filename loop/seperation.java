import java.util.*;
public class seperation
{
	public static void main(String[] args)
	{
	 int i,m=0,m1=0;
	 int a[]={1,0,1,0,1,0};
	 
	 for(i=0;i<a.length;i++)
	 {
	  if(a[i]==0)
	  {
	    m++;
	    a[m]=a[i];
	  
	  }
	 
	 
	 if(a[i]==1)
	  {
	  m1++;
	  a[m1]=a[i];
	  
	  }
	  }
	  
	  System.out.print(Arrays.toString(a));
	}
}
	  
	  
	
	  
	   
	   
	
	 
	   
	   
	   
	   
	   
