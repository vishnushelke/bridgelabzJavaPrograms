package com.bridgelabz.algorithm;


import java.util.*;
public class P10VendingMachine {
	
	public static void Notes(int amount)
	{
		int a[]= {1000,500,200,100,50,20,10,5,2,1};
		int i=0;
		while(amount>0 && i<a.length)
		{
			
			if(amount>=a[i])
			{
				int c=amount/a[i];
				System.out.println(c+" Notes of "+a[i]);
				amount=amount%a[i];
				//i++;
			}
			else
			{
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		Notes(amount);
	}

}