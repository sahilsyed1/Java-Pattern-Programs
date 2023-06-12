package com.jsp.newpatterns;
import java.util.*;
class Np
{
	public void N1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1,p=5; j<=i; j++,p--)
			{ 
				System.out.print(p+" ");
				
			}
			System.out.println();
		}
	}
	public void N2(int n)
	{
		for(int i=1,p=0; i<=n; i++,p+=2)
		{
			for(int j=1; j<=i; j++)
			{ 
				System.out.print(p+" ");
				
			}
			System.out.println();
		}
	}
	public void N3(int n)
	{
		for(int i=1,p=8; i<=n; i++,p-=2)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N4(int n)
	{
		for(int i=1,p=0; i<=n; i++,p+=2)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print(p+" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N5(int n)
	{
		for(int i=1,p=8; i<=n; i++,p-=2)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print(p+" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N6(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2==0)
					System.out.print("1 ");
				else
					System.out.print("2 ");
			}
			System.out.println();
		}
	}
	public void N7(int n)
	{
		for(int i=1,k=1; i<=n; i++,k++)
		{
			for(int j=i,p=k; j<=n; j++,p++)
			{
				System.out.print(p+" ");
			}
			for(int j=1,p=1; j<i; j++,p++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N8(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1,p=n; j<=n; j++,p--)
			{
				if(i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(p+" ");
				}
			}
			System.out.println();
		}
	}
	public void N9(int n)
	{
		for(int i=1,k=n; i<=n; i++,k--)
		{
			for(int j=i,p=k; j<=n; j++,p--)
			{
				System.out.print(p);
				if(j==n)System.out.print("*");
			}
			System.out.println();
		}
	}
	public void N10(int n)
	{
		for(int i=1,k=1; i<=n; i++,k--)
		{
			int p=1;
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++,p++)
			{
				System.out.print(p+" ");
			}
			for(int j=1; j<=i; j++,p++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N11(int n)
	{
		for(int i=1,k=1; i<=n; i++,k++)
		{
			int p=1;
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++,p++)
			{
				System.out.print(p+" ");
			}
			for(int j=1,t=k; j<=i; j++,t--)
			{
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
	public void N12(int n)
	{
		int c=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				for(int j=1; j<=n; j++)
				{
					c=c+1;
					System.out.print(c+" ");
				}
			}
			else
			{
				for(int j=1; j<=n; j++)
				{
					System.out.print(c+" ");
					c=c-1;
				}
			}
			System.out.println();
			c=c+n;
		}
	}
	public void N13(int n)
	{
		for(int i=1,k=n; i<=n; i++,k--)
		{
			for(int j=i,p=k; j<=n; j++,p--)
			{
				System.out.print(p+" ");
				if(j==n)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void N14(int n)
	{
		for(int i=1,k=1; i<=n; i++,k++)
		{
			for(int j=i,p=k; j<=n; j++,p++)
			{
				System.out.print(p);
			}
			System.out.println();
		}
	}
	public void N15(int n)
	{
		for(int i=1,k=1; i<=n; i++,k++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1,p=k; j<=i; j++,p--)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N16(int n)
	{
		for(int i=1,p=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
	public void N17(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1,p=i; j<i; j++,p--)
			{
				System.out.print(p);
			}
			for(int j=i,p=1; j<=n; j++,p++)
			{
				System.out.print(p);
			}
			System.out.println();
		}
	}
}
public class NumPattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Size");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		Np np = new Np();
		np.N12(n);
	}

}
