package com.bridgelabz.functional;
import java.util.*;
public class P10NumberOfTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int count=0;
		int[] a=new int[n];
		System.out.println("Enter "+n+" numbers one by one");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
				}
			}
		}
		System.out.println("NUmber of triplets are "+count);

	}

}
