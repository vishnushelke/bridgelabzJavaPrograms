package com.bridgelabz.fellowship;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Study {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		String s1=String.valueOf(n1);
		int n2=sc.nextInt();
		String s2=String.valueOf(n2);
		System.out.println(Utility.isAnagram(s1,s2));

	}

}
