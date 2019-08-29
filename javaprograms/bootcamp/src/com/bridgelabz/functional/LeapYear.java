package com.bridgelabz.functional;
import java.util.Scanner;
public class LeapYear {

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
