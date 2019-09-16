/******************************************************************************
 *  Compilation:  javac -d bin P9CalenderUsingQueue.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P9CalenderUsingQueue n
 *  
 *  Purpose: Takes Month and year as input and prints calendar of that month
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   16-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.data_structure;

import java.util.*;

import com.bridgelabz.utility.Utility;

public class P9CalenderUsingQueue {

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
		Queue<String> q = new Queue<String>();
		Queue<String> cal = new Queue<String>();
		q.enQueue("  S");
		q.enQueue("  M");
		q.enQueue("  T");
		q.enQueue("  W");
		q.enQueue(" Th");
		q.enQueue("  F");
		q.enQueue("  S");
		q.show();
		System.out.println();
		int d = Utility.DayOfWeek(1, m, y);
		//System.out.println(d);
		for (int i = 0; i < d; i++) {
			cal.enQueue("   ");
		}

		for (int i = 1; i <= days[m]; i++) {

			if (i < 10)
				cal.enQueue("  " + i);
			else
				cal.enQueue(" " + i);
			if((d+i)%7==0)
				cal.enQueue("\n");
		}

		cal.show();
		sc.close();
	}

}