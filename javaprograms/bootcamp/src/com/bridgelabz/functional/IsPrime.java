package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class IsPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Utility.isPrime(n);
		sc.close();
	}

}
