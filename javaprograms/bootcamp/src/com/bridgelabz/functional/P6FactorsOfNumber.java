/******************************************************************************
 *  Compilation:  javac -d bin P6FactorsOfNumber.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P6FactorsOfNumber n
 *  
 *  Purpose: Displays the prime Factors of Number n
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
public class P6FactorsOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		System.out.println("Required Factors are :");
			while(n>=0)
			{
				for(int i=2;i*i<=temp;i++)
			{
				
			if(n%i==0)
				{
				  System.out.print(i+" ");
				  n=n/i;
				  i--;
				}
			}
		}

	}

}
