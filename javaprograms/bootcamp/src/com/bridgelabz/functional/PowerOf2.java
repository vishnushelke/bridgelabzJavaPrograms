package com.bridgelabz.functional;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println((int)Math.pow(2, i));
		}
		sc.close();
	}

}
