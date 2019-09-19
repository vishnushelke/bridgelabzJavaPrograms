/******************************************************************************
 *  Compilation:  javac -d bin P10VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P10VendingMachine n
 *  
 *  Purpose: Determines notes required to give change of n rupees.
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;


import java.util.*;
public class P10VendingMachine {
	
	public static void Notes(int amount)
	{
		//Different notes in machine
		int a[]= {1000,500,100,50,10,5,2,1};
		int i=0;
		while(amount>0 && i<a.length)
		{
			
			if(amount>=a[i])
			{
				int c=amount/a[i];
				System.out.println(c+" Notes of "+a[i]);
				amount=amount%a[i];
				
			}
			else
			{
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		//Taking Rupees from User
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		if(amount<0)
		{
			System.out.println("Amount can not be negative");
		}
		Notes(amount);
	}

}