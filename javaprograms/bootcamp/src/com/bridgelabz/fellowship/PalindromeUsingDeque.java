package com.bridgelabz.fellowship;
import java.util.*;
public class PalindromeUsingDeque {
//	
//	public static char deque(char[] a)
//	{
//		
//	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word to be checked");
	String word=sc.nextLine();
	int n=word.length();
	
	char[] a=new char[n];
	char[] b=new char[n];
	a=word.toCharArray();
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<n;j++)
			{
				b[i]=a[j];
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
	
	}
}
