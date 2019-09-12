package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.Random;
public class P8CoupenCounter {
	
	public static int Rand(int n)
	{
		Random rand=new Random();
		int x=rand.nextInt(n)+1;
		return x;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int count=0,dist=0;
		int[] a=new int[n];

		//array created of length n
		for(int i=0;i<n;i++)
		{
			a[i]=i+1;
		}
		
		while(dist<n)
		{
			count++;
			int x=Rand(n);
			if(a[x-1]!=0)
			{
				dist++;
				a[x-1]=0;
			}
		}
		//printing result
		System.out.println("Total count for taking "+n+" generating different coupen numbers is "+count);
	}

}
