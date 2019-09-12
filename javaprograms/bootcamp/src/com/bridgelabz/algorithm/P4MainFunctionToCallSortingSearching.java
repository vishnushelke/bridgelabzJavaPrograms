package com.bridgelabz.algorithm;
import java.util.*;
import com.bridgelabz.utility.Utility;

public class P4MainFunctionToCallSortingSearching {
	
	public static long start()
	{
		long start=System.nanoTime();
		return start;
	}
	public static long end(long start)
	{
		long end=System.nanoTime();
		long elapse=end-start;
		return elapse;
	}
	
	public static void display(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void displayString(String[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a= {15,40,56,84,11,75};
		int searchN=40;
		String[] b= {"vishnu","keshav","rishi","priyanka","abhishek","vaishnavi"};
		String search="vishnu";
		//BinaryWordSearch
		long start1=start();
		Utility.binaryWordSearch(b, search);
		long elapse1=end(start1);
		System.out.println("Elapsed time for BInaryWord search: "+elapse1);
		
		//binaryNumberSearch
		long start2=start();
		Utility.binaryNumberSearch(a, searchN);
		long elapse2=end(start2);
		System.out.println("Elapsed time for BInaryNumber search: "+elapse2);
		
		//insertionNumberSort
		long start3=start();
		int[]inSortN=Utility.insertionNumberSort(a);
		System.out.println("Insertion Sorted Array is :");
		display(inSortN);
		long elapsed3=end(start3);
		System.out.println("Elapsed time for InsertionNumber sort: "+elapsed3);
		
		//insertionwordSort
		long start4=start();
		String[]inSortW=Utility.insertionWordSort(b);
		System.out.println("Insertion Sorted Array is :");
		displayString(inSortW);
		long elapsed4=end(start4);
		System.out.println("Elapsed time for InsertionWord sort: "+elapsed4);
				
		//bubblewordSort
		long start5=start();
		Utility.bubbleWordSort(b);
		System.out.println("Bubble Sorted Array is :");
		displayString(Utility.bubbleWordSort(b));
		long elapsed5=end(start5);
		System.out.println("Elapsed time for BubbleWord sort: "+elapsed5);
		
		//bubbleNumberSort
		long start6=start();
		Utility.bubbleNumberSort(a);
		System.out.println("Bubble Sorted Array is :");
		display(Utility.bubbleNumberSort(a));
		long elapsed6=end(start6);
		System.out.println("Elapsed time for BubbleNumber sort: "+elapsed6);
		
		
	}

}