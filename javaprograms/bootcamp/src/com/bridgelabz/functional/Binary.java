package com.bridgelabz.functional;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=0;
		int arr[]=new int[32];
		
		while((Math.pow(2,x))<n)
		{
			x++;
		}
		for(int i=0;i<x;i++)
		{
			arr[i]=n%2;
			n=n/2;
			
		}
		
		
		for(int i=31-x;i>=x;i--)
		{
			arr[i]=0;
		}
		for(int i=31;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		sc.close();
	}

}
