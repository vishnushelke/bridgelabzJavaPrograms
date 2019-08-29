package com.bridgelabz.functional;

public class Stats5 {

	public static void main(String[] args) {
		double a[]=new double[5];
		for(int i=0;i<5;i++)
		{
		 a[i]=Math.random();
			System.out.print("   "+a[i]);
		}
		System.out.println();
		System.out.println("minimum of these is "+ Math.min(a[0], Math.min((Math.min(a[1], a[2])) , (Math.min(a[3], a[4])))));
		System.out.println("maximum of these is "+ Math.max(a[0], Math.max((Math.max(a[1], a[2])) , (Math.max(a[3], a[4])))));
		System.out.println("average of these is "+ (a[0]+a[1]+a[2]+a[3]+a[4]));

	}

}
