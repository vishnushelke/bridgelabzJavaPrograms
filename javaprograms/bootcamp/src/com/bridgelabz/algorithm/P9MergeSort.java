/******************************************************************************
 *  Compilation:  javac -d bin P9MergeSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P9MergeSort n
 *  
 *  Purpose: Perform Sorting using Merge Sort
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;


public class P9MergeSort {

	public static void Merge(int[] a,int li,int mi,int hi)
	{
		//declaring ;ength of 2 subarrays
		int n1=mi-li+1;
		int n2=hi-mi;
		
		//creating two temp subarrays for saving
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		//Saving elements into temp arrays
		for(int i=0;i<n1;i++)
		{
			L[i]=a[li+i];
		}
		for (int j = 0; j < n2; j++) {
			R[j]=a[mi+j+1];
		}
		
		//indexes of two subarrays
		int i=0,j=0;
		//index of a merged array
		int k=li;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		//Enter the Remaining Elements
		
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	
	public static void sort(int[] a,int li,int hi)
	{
		if(li<hi)
		{
			int mi=(li+hi)/2;
			//sorting 2 subarrays
			sort(a,li,mi);
			sort(a,mi+1,hi);
			Merge(a,li,mi,hi);
		}
		
	}
	
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {25,12,8,15,34};
		//display(a);
		
		sort(a,0,a.length-1);
		
		display(a);
	}

}