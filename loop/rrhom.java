
	

import java.util.*;
public class rrhom
{
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();

		int i,c=1;
		int uj;
		for(i=0;i<n;i++)
		{
			for(int sp=0;sp<n-i-1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				if(j==0)
				{
					c=i+1;
				}
				else if(i==j)
				{
					c=1;
				}
				else if(c!=0 && i>j)
				{
					c--;
				}
				else if(c==1 ||i<j&&c!=0)
				{
					c++;
				}
				System.out.print(c);
			}
			System.out.println();
		}

		for(int ui=n+1;ui<=n*2-1;ui++)
		{
			for(uj=0;uj<ui-n;uj++)
		{
			System.out.print(" ");
		}
		for(int uk=n-uj;uk>=1;uk--)
		{
			System.out.print(uk);
		}
		for(int l=2;l<=n-uj;l++)
		{
			System.out.print(l);
		}
		System.out.println();
	}
}
}




