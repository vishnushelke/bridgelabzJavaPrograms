package com.bridgelabz.functional;
import java.lang.Math;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		int a,b,c;
		double d,r1,r2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a= sc.nextInt();
		System.out.println("enter the value of b");
		b= sc.nextInt();
		System.out.println("enter the value of c");
		c= sc.nextInt();
		
		d=b*b-4*a*c;
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		
		System.out.println("Required roots of x are "+ r1+" and "+r2);
		sc.close();
	}

}
