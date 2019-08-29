package com.bridgelabz.functional;
import java.util.*;
public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Lower limit");
		int xlower=sc.nextInt();
	
		System.out.println("Enter the upper limit");
		int xupper=sc.nextInt();
		
		for( int i=xlower;i<=xupper;i++)
		{
			int x=0;
			if((i==0) || (i==1))
			{
				x=1;
			}
			
			for(int j=2;j<=i/2;j++)
			{
				
				if(i%j==0)
				{
					x=1;
				}
				
			}
			if(x==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
