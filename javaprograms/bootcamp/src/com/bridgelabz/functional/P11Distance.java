/******************************************************************************
 *  Compilation:  javac -d bin P11Distance.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P11Distance n
 *  
 *  Purpose: Finds the Euclidean Distance of a point from origin
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
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
