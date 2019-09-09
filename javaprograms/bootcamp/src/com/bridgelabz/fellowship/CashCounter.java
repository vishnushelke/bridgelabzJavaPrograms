package com.bridgelabz.fellowship;
import java.util.Scanner;
public class CashCounter {

	public static void main(String[] args) {
		
		int money=0;
		Scanner sc=new Scanner(System.in);
		int x=0;
		
		for(int i=0;i<10;i++) Queue.enqueue(i+1);
		int size=5;
		while(size>=0)
		{
			if(size==0) 
				{
					System.out.println("No more customers today");
					break;
				}
			else
			{
				System.out.println("Sir,if you want to deposit money,enter 0 or to withdraw money,enter 1");
				int n=sc.nextInt();
				if(n==0)
				{
					System.out.println("How much money you want to deposit");
					int n1=sc.nextInt();
					money=money+n1;
					size--;
				}
				else
				{
					System.out.println("How much money you want to Withdraw");
					int n2=sc.nextInt();
					money=money-n2;
					size--;
					
				 if(money<0)
					{
						System.out.println("no more money");
						System.out.println("end result is false");
						x=1;
						break;
					}
					
				}
				if(x==0 && size>0) System.out.println("Next please");
			}
		}
		if(money==0) System.out.println("end result is true");
		else if(money>0) System.out.println("end result is false,some money still there in bank");
		
		sc.close();
	}

}
