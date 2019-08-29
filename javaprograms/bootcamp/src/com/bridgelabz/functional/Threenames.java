package com.bridgelabz.functional;
import java.util.Scanner;
public class Threenames {
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first name");
		String s1 = sc.nextLine();
		System.out.println("enter the second name");
		String s2 = sc.nextLine();
		System.out.println("enter the third name");
		String s3 = sc.nextLine();
		System.out.println("Hi "+s3+","+s2+" and "+s1);
		sc.close();
	}

}
