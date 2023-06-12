package com.jsp.newpatterns;
import java.util.*;

class Hpattern
{
	public void BoxP1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==1||j==1||i==n||j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void Xp2(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j||i+j==n+1) System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void PlusP3(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==n/2+1||j==n/2+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public void RightTriangleP4(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==n||j==1||j==i)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void LeftTraingleP5(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(i==n||j==1||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void DownwardTriangleRytP6(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				if(i==1||j==i||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void DownwardTriangleLeftP7(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				if(i==1||j==i||j==n)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void PyramidTriangleP8(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				if(i==n||j==1||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void ReversePyramidP9(int n)
	{
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				if(i==1||j==i||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	public void HillTriangleP10(int n)
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
	public void DownHillTriangleP11(int n)
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
	public void DaimondTriangleP12(int n)
	{
		for(int i=1; i<n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<i; j++)
			{
				if(j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1; j<=i; j++)
			{
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
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
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=i; j<=n; j++)
			{
				if(j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}	
	}
}


public class Hallowpatterns 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Size");
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		int n=scn.nextInt();
		Hpattern p1 = new Hpattern();
		p1.DaimondTriangleP12(n);
	}
}





