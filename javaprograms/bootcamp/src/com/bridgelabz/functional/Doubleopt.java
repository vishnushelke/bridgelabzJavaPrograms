package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Doubleopt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a=sc.nextDouble();
		System.out.println("Enter the value of b");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c");
		double c=sc.nextDouble();
		
		Utility.Doubleopt(a,b,c);
		sc.close();
	}

}
