/******************************************************************************
 *  Compilation:  javac -d bin P5QuestionToFindYourNumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P5QuestionToFindYourNumber n
 *  
 *  Purpose: Asks you a question till finding your number
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class P5QuestionToFindYourNumber {
	
	public static void Magic(int a[])
	{
		int n=a.length;
		
		int li=0,hi=n-1,mi=(hi+li)/2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Think of a number in your mind upto "+(n-1));
		
		while(li<=hi)
		{
			System.out.println("If your number is "+mi+",enter 0,wlse enter 1.");
			int answer=Utility.intScan();
			if(answer==0)
			{
				System.out.println("Your number is "+mi);
				break;
			}
			
			
			System.out.println("if number is "+(li)+" to "+(mi)+" enter 0.Else,enter 1");
			int response=sc.nextInt();
			if(li==hi)
			{
				System.out.println("The number you thought is "+li);
				break;
			}
			else if(response==0)
				hi=mi-1;
			else
				li=mi+1;
			mi=(li+hi)/2;
			
		}
		sc.close();
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int p=(int)Math.pow(2, n);
		
		int a[]=new int[p+1];
		for(int i=0;i<=p;i++)
		{
			a[i]=i;
		}
		Magic(a);
		sc.close();
		
	}

}
