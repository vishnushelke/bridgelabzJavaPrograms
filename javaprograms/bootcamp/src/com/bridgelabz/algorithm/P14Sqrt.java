/******************************************************************************
 *  Compilation:  javac -d bin P14Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P14Sqrt n
 *  
 *  Purpose: Calculates the SquareRoot of number n  
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class P14Sqrt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double n=sc.nextDouble();
		
		double epsilon=1e-15;
		double t=n;
		while(Math.abs(t-(n/t))>epsilon*t)
		{
			t=((n/t)+t)/2;
		}
		System.out.println("Square root is "+t);
		sc.close();
	}

}
