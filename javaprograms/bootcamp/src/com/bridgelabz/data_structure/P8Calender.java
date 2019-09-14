/******************************************************************************
 *  Compilation:  javac -d bin P1UnOrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P1UnOrderedList n
 *  
 *  Purpose: Takes month and year as input and prints calendar of that month
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;

import java.util.*;

import com.bridgelabz.utility.Utility;

public class P8Calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creating an array to display Calendar
		String[][] cal = new String[6][7];

		// Taking Inputs from User
		System.out.println("Enter the month");
		int m = sc.nextInt();
		System.out.println("Enter the year");
		int y = sc.nextInt();

		// Printing First 3 Rows
		System.out.println("   Java Calender " + m + " " + y);
		String[] month = { "0", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("  " + month[m] + " " + y);
		System.out.println("   S   M   T   W  TH   F   S");
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// Checking the condition of Leap Year
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
			days[2] = 29;
		}
		int d = Utility.DayOfWeek(1, m, y);
		
		//Printing Initial Spaces
		for (int i = 0; i < d; i++) {
			cal[0][i] = "    ";
		}
		
		//Taking values in array
		int tempDay = 0;
		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++) {
				if (!(i == 0 && j < d)) {
					if (tempDay <= days[m]) {
						tempDay++;
						if (tempDay < 10) {
							cal[i][j] = "   " + tempDay;
						} else {
							cal[i][j] = "  " + tempDay;
						}
					} else {
						break;
					}
				}

			}
		}
		
		//Printing an array
		tempDay = 0;
		for (int i = 0; i < cal.length; i++) {
			for (int j = 0; j < cal[i].length; j++) {
				if (days[m] >= tempDay) {
					tempDay++;

					System.out.print(cal[i][j]);

				} else {
					break;
				}

			}
			System.out.println();
		}
		sc.close();
	}
}
