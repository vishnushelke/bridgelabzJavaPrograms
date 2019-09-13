/******************************************************************************
 *  Compilation:  javac -d bin P8BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P8BubbleSort n
 *  
 *  Purpose: Perform Sorting using BUbble Sort
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

public class P8BubbleSort {
	
	public static void Bubble(int a[])
	{
		int n=a.length;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		int a[]= {10,5,2,6,9,14,23};
		Bubble(a);
	}

}
