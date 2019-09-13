/******************************************************************************
 *  Compilation:  javac -d bin P3LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P3LeapYear n
 *  
 *  Purpose: Finds whether user given Year is Leap year or not
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
public class P3LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		long yr=sc.nextLong();
		
		if(yr>1581 && yr%400==0 || yr%4==0 && yr%100!=0)
		{
			System.out.println("It is a leap year");

		}
		else
		{
			System.out.println("It is not a leap year");

		}
		sc.close();
	}

}
