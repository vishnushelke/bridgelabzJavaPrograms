package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class P11Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x");
		double x=sc.nextDouble();
		System.out.println("enter the value of y");
		double y=sc.nextDouble();
		
		Utility.Distance(x,y);
		sc.close();
	}

}