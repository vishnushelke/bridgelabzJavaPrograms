/******************************************************************************
 *  Compilation:  javac -d bin P4PowerOf2.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P4PowerOf2 n
 *  
 *  Purpose: Takes the user input n and printd the table of power of 2 upto n
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
public class P4PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println((int)Math.pow(2, i));
		}
		sc.close();
	}

}
