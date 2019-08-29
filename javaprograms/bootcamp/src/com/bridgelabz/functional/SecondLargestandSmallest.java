package com.bridgelabz.functional;
public class SecondLargestandSmallest {

	public static void main(String[] args) {
		int a[]= {10,30,44,45,22,19};
		int n=a.length;
		int max=Integer.MIN_VALUE;
		int secmax=max;
		
		
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				secmax=max;
				max=a[i];
			}
		}
		
		System.out.println("Second largest number is "+secmax);
		
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println("second minimum is"+secmin);
		
	}

}
