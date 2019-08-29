package com.bridgelabz.functional;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		double n=sc.nextDouble();
		Double H=(double) 0;
		
		for(double i=1;i<=n;i++)
		{
			double x=1/i;
			H=H+x;
		}
		System.out.println("Required nth Harmonic number is "+H);
		sc.close();
	}

}
