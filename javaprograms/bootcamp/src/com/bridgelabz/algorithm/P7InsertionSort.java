/******************************************************************************
 *  Compilation:  javac -d bin P7InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P7InsertionSort n
 *  
 *  Purpose: Perform Sorting using Insertion Sort
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

public class P7InsertionSort {
	
	public static void Insertion(String a[])
	{
		int n=a.length;
		String temp=" ";
		
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			int j=0;
			j=i;
			while((j>0) && (a[j-1].compareTo(temp)>0))
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		String a[]= {"vishnu","abhishek","rishi","priyanka","vaishnavi"};
		Insertion(a);
	}

}
