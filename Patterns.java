package com.jsp.newpatterns;
import java.util.*;

class Pattern
{
	public void boxPattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void increasingTriangle(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void decreasingTriangle(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void rightsidedTriangle1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void rightsidedTriangle2(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void hillpattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void downhillpattern(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void daimondpattern(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void rightturntriangle(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void leftturntriangle(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void butterflypattern(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++) System.out.print("* ");
			for(int j=i; j<n; j++) System.out.print("  ");
			for(int j=i; j<n; j++) System.out.print("  ");
			for(int j=1; j<=i; j++) System.out.print("* ");
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++) System.out.print("* ");
			for(int j=1; j<i; j++) System.out.print("  ");
			for(int j=1; j<i; j++) System.out.print("  ");
			for(int j=i; j<=n; j++) System.out.print("* ");
			System.out.println();
		}
	}
	public void rightspaceTri(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void leftspaceTri(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void DaimondSpace(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
public class Patterns
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=scn.nextInt();
			for(int i=1; i<=n; i++)
			{
				for(int j=i; j<=n; j++)
				{
					System.out.print("  ");
				}
				for(int j=1; j<i; j++)
				{
					System.out.print("* ");
				}
				for(int j=1; j<=i; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}























