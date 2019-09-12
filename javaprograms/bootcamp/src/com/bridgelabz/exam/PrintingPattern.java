package com.bridgelabz.exam;
import java.util.*;
public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int k=n-1;
			for(int j=0;j<=i;j++)
			{
				
				while(k-i>0)
				{
					System.out.print(" ");
					k--;
				}
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
