package com.bridgelabz.functional;
import java.util.Scanner;
public class Trig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Angle in degrees");
		double d=sc.nextDouble();
		Double a=Math.toRadians(d);
		System.out.println("value of Angle in Radians is "+a);
		
		System.out.println("sin(angle) : "+Math.sin(a));
		System.out.println("cos(angle) : "+Math.cos(a));
		System.out.println("tan(angle) : "+Math.tan(a));
		System.out.println("cot(angle) : "+(1/Math.tan(a)));
		System.out.println("sec(angle) : "+(1/Math.cos(a)));
		System.out.println("cosec(angle) : "+(1/Math.sin(a)));
		sc.close();
	}

}
