package com.bridgelabz.functional;
import java.lang.Math;
import java.util.Scanner;
public class RandomValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr number upto which you want a random value");
		int p=sc.nextInt();
		double r=Math.random();
		int n=(int)(r*p);
		System.out.println(n);
		sc.close();
	}

}
