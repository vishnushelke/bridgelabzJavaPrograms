package com.bridgelabz.functional;
import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of v in miles per hour");
		double v=sc.nextDouble();
		
		System.out.println("Enter the value of t in fehrenheit");
		double t=sc.nextDouble();
		
		if((t<-50)||t>50||v<3||v>120)
		{
			System.out.println("Formula is not valid for these values");
		}
		else
		{
			double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("Required value of WindChill is "+w);
		}
		sc.close();
	}

}
