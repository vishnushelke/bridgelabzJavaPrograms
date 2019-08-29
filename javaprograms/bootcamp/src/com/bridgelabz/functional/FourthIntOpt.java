package com.bridgelabz.functional;
import java.util.Scanner;
public class FourthIntOpt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();
		
		int d=a+b*c;
		int e=a*b+c;
		int f=c+a/b;
		int g=a%b+c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		sc.close();
	}

}
