package com.bridgelabz.functional;
import java.util.Scanner;
public class ArmstrongCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		int temp=a;
		int n=0,b=0;
		while(a>0)
		{
			n=a%10;
			a=a/10;
			b=b+(n*n*n);
		}
		if(temp==b)
			System.out.println("This is an Armstrong number");
		else
			System.out.println("This is not an Armstrong number");
		sc.close();
	}

}
