/******************************************************************************
 *  Compilation:  javac -d bin P5HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P5HarmonicNumber n
 *  
 *  Purpose: Calculates the nth Harmonic number
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
public class P5HarmonicNumber {

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
		System.out.println("Required "+(int)n+"th Harmonic number is "+H);
		sc.close();
	}

}
