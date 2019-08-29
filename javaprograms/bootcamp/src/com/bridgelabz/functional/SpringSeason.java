package com.bridgelabz.functional;
import java.util.Scanner;
public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		int m=sc.nextInt();
		System.out.println("enter the date");
		int d=sc.nextInt();
		
		if(m==3 && d>19 && d<32 || m==4 && d>0 && d<31 || m==5 && d>0 && d<32 || m==6 && d>0 && d<21)
		{
			System.out.println("True");

		}
		else
		{
			System.out.println("False");

		}
		sc.close();
	}

}
