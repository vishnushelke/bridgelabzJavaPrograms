/******************************************************************************
 *  Compilation:  javac -d bin P7GamblingSimulator.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P7GamblingSimulator n
 *  
 *  Purpose: Determines when to quit the Gambling
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Scanner;
import java.lang.Math;
public class P7GamblingSimulator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stakes at beginning");
		int stakes=sc.nextInt();
		
		
		System.out.println("Enter the Goal");
		int goal=sc.nextInt();

		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		int wq=0,lq=0;
		for(int i=0;i<n;i++)
		{
			double a=Math.random();
			if(a>0.5)
			{
				if((goal==stakes) || (stakes==0))
					break;
				wq++;
				stakes++;
				
			}
			else 
			{
				if((goal==stakes) || (stakes==0))
					break;
				lq++;
				stakes--;
			}
			
		}
		System.out.println("Win number= "+wq);
		System.out.println("Loss number= "+lq);
		
		System.out.println("Percent win= "+(wq*100)/(wq+lq));
		System.out.println("Percent Loss= "+(lq*100)/(wq+lq));
		sc.close();
	}

}
