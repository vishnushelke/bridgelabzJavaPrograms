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
package com.bridgelabz.datastructure;

import java.util.Scanner;

public class P4BankCashCounter {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of customers");
		int customers=sc.nextInt();
		int money=50000;
		
		int size1=customers;
		for (int i = 0; i < customers; i++) {
			list.insert(i+1);
		}
		list.show();
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
						System.out.println("Sorry!you cannot withdraw this amount,enter an amount upto "+money);
						System.out.println("How much money you want to withdraw?");
						int withdraw=sc.nextInt();
						money=money-withdraw;
						
					}
					else {
						money=money-w;
					}
					System.out.println("Money in Bank is "+money);
					
				}
			}
			list.deleteAt(0);
			list.show();
			size1--;
		}
		if(money==0 && size1==0)
		{
			System.out.println("true");
		}
		else System.out.println("false");

	}

}
