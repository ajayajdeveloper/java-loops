import java.util.*;
public class PPascal

{
	 public static void main(String[] args)
	 {
		   int i,j,n;
		   int a[][]=new int[n][n];
		   scanner sc=new scanner(System.in);
		   n=sc.nextInt();
		   
		   for(i=0;i<n;i++)
		   {
		    a[i][0]=1;
		    a[i][i]=1;
		   }
		    for(i=0;i<n;i++)
		    {
			      for(j=0;j<=i;j++)
			      {
			        if(a[i][j]==0)
				a[i][j]=(a[i-1][j-1]+a[i-1][j]);
			       }
		     }
		     
		    for(i=0;i<n;i++)
		    {
			     for( j=0;j<=i;j++)
			     {
				System.out.print(a[i][j]);
			     }
			     System.out.println();
		    }
	    
	 }
}
   
