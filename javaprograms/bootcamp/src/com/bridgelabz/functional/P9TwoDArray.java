package com.bridgelabz.functional;
import java.util.*;
public class P9TwoDArray {
	
	public static void bolleanArray(int m,int n)
	{
		Scanner sc=new Scanner(System.in);
		boolean[][] b=new boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter a boolean value");
				boolean c=sc.nextBoolean();
				b[i][j]=c;
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void intArray(int m,int n)
	{
		Scanner sc=new Scanner(System.in);
		int[][] b=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter an integer number");
				int c=sc.nextInt();
				b[i][j]=c;
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	

	public static void doubleArray(int m,int n)
	{
		Scanner sc=new Scanner(System.in);
		double[][] b=new double[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter a double number");
				double c=sc.nextDouble();
				b[i][j]=c;
			}
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of rows");
		int m=sc.nextInt();
		System.out.println("Enter total number of columns");
		int n=sc.nextInt();
		
		int y=0;
		while(y==0)
		{
			System.out.println();
			System.out.println("What do you want to print?\n1.boolean Array\n2.Integer Array\n3.Double Array");
			int x=sc.nextInt();
			switch(x)
			{
			case 1:bolleanArray(m,n);break;
			case 2:intArray(m,n);break;
			case 3:doubleArray(m,n);break;
			}
		}
		
	}

}