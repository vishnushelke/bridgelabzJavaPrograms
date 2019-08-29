package com.bridgelabz.functional;
import java.util.*;
public class StringFunctions {
	
	public static void swap(char[]arr , int i, int j)
	{
		char c=arr[i];
		arr[i]=arr[j];
		arr[j]=c;
	}
	

	public static void reverse(char arr[],int i, int j)
	{
		while(i<j)
		{
			swap(arr,i++,j--);
		}
	}
	
	public static int factorial(int p)
	{
		int n=1;
		for (int i=1;i<=p;i++)
		{
			n=n*i;
		}
		return n;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		
		System.out.println("Enter the second string");
		String s2=sc.nextLine();
		int x=0,y=0;
		sc.close();
		//checking for anagram
		if(s1.length()!=s2.length())
		{
			x=0;
		}
		else
		{
		for(int i=0;i<s1.length();i++)
		{
			y=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					x=1;
					break;
				}
				if(x==0)
				{
					y=1;
				}
				
			}
			
			
		}
		
		}
		if(y==1)
		{
			System.out.println("Strings are not anagram");
		}
		else System.out.println("Strings are anagram");
		
		
		//checking for palindrome
		String rev="";
		int z=s1.length()-1;
		for(int i=z;i>=0;i--)
		{
			rev+=s1.charAt(i);	
			
		}
		if(s1.equals(rev))
		{
			System.out.println("String1 is palindrome");
		}
		else System.out.println("String1 is not palindrome");
	
	//permutation of string using iterative method
		
		String s=sc.nextLine();
		char chars[]=s.toCharArray();
		Arrays.sort(chars);
		int n=factorial(s.length());
		while (true)
		{
			
			System.out.print(String.valueOf(chars) + " ");
			int i = n - 1;
			while (chars[i-1] >= chars[i])
			{
				
				if (--i == 0)
					return;
			}

			int j = n - 1;
			while (j > i && chars[j] <= chars[i-1])
				j--;
			swap(chars, i-1, j);
			reverse (chars, i, n-1);
		}

	}

}
