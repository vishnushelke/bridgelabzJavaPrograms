/******************************************************************************
 *  Compilation:  javac -d bin P4BankCashCounter.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P4BankCashCounter n
 *  
 *  Purpose: Serves the customers and if money left at the end is 0,prints true
 *  		 else prints false. 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;

import java.util.Scanner;

public class P4BankCashCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=0;
		Queue<Integer> q=new Queue<Integer>();
		int size1=10;
		for (int i = 0; i < 10; i++) {
			q.enQueue(i+1);
		}
		while(size1>=0 && money>=0)
		{
			if(size1==0)
			{
				System.out.println("sorry!no more Customers Today!");
				break;
			}
			else
			{
				System.out.println("Welcome to the Bank.\nIf you want to deposit money,enter 0 else enter 1");
				int n=sc.nextInt();
				if(n==0)
				{
					System.out.println("How much money you want to deposit?");
					money=money+sc.nextInt();
					System.out.println("Money in Bank is "+money);
				}
				else
				{
					System.out.println("How much money you want to withdraw?");
					int w=sc.nextInt();
					if(w>money)
					{
						System.out.println("Sorry!you cannot withdraw this amount");
						break;
					}
					else {
						money=money-w;
					}
					System.out.println("Money in Bank is "+money);
					
				}
			}
			size1--;
		}
		if(money==0 && size1==0)
		{
			System.out.println("true");
		}
		else System.out.println("false");

	}

}
