/******************************************************************************
 *  Compilation:  javac -d bin P10CalenderUsingStack.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P10CalenderUsingStack n
 *  
 *  Purpose: Takes Month and year as input and prints calendar of that month
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   16-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.data_structure;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class P10CalenderUsingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the month");
		int m = sc.nextInt();
		System.out.println("Enter the year");
		int y = sc.nextInt();

		System.out.println("   Java Calender " + m + " " + y);
		String[] month = { "0", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("  " + month[m] + " " + y);
		Stack<String> s = new Stack<String>();
		Stack<String> cal = new Stack<String>();
		
		s.push("  S");
		s.push("  M");
		s.push("  T");
		s.push("  W");
		s.push(" Th");
		s.push("  F");
		s.push("  S");
		s.show();
		System.out.println();
		int d = Utility.DayOfWeek(1, m, y);
		// System.out.println(d);
		for (int i = 0; i < d; i++) {
			cal.push("   ");
		}
		

		for (int i = 1; i <= days[m]; i++) {

			if (i < 10)
				cal.push("  " + i);
			else
				cal.push(" " + i);
			if ((d + i) % 7 == 0)
				cal.push("\n");
		}

		cal.show();
		sc.close();
	}

}
