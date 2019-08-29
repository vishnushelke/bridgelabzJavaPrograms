package com.bridgelabz.functional;
import java.util.Scanner;
import java.lang.Math;
public class GamblingSimulator {

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
