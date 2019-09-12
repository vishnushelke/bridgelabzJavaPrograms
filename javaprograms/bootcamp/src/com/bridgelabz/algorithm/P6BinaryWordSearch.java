package com.bridgelabz.algorithm;
import java.util.Scanner;
public class P6BinaryWordSearch {
	
	public static void WordSearch(String a[])
	{
		int n=a.length;
		int li=0,hi=n-1,mi=(li+hi)/2,x=0;
		String temp="";
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the word to be searched");
		Scanner sc=new Scanner(System.in);
		String search=sc.next();
		
		while(li<=hi)
		{
			if(search.equals(a[mi]))
			{
				System.out.println("Word found at index value "+mi);
				x=1;
				break;
			}
			
			else if(search.compareTo(a[mi])>0)
				li=mi+1;
			else hi=mi-1;
			mi=(li+hi)/2;
		}
		if(x==0)
			System.out.println("Word not found");
		sc.close();
	}

	public static void main(String[] args) {
		String a[]= {"apple","aai","aau","ar","ab","aim"};
		WordSearch(a);
	}

}