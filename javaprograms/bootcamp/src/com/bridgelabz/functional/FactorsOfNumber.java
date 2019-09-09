package com.bridgelabz.functional;
import java.util.Scanner;
public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		System.out.println("Required Factors are :");
			while(n>=0)
			{
				for(int i=2;i*i<=temp;i++)
			{
				
			if(n%i==0)
				{
				  System.out.print(i+" ");
				  n=n/i;
				  i--;
				}
			}
		}

	}

}
