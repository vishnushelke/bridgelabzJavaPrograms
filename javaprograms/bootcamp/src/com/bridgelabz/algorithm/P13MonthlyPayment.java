/******************************************************************************
 *  Compilation:  javac -d bin P13MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P13MonthlyPayment n
 *  
 *  Purpose: Determines the monthly payment to return the amount taken for n time 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class P13MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate");
		int r=sc.nextInt();
		System.out.println("Enter the Years");
		int y=sc.nextInt();
		System.out.println("Enter the Rupees");
		int p=sc.nextInt();
		int n=12*y;
		double r1=r/1200;
		System.out.println("Monthly Payament should be :"+(p*r1/(1-Math.pow(1+r1, n))));
	}

}
