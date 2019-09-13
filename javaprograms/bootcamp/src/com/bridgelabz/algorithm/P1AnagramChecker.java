/******************************************************************************
 *  Compilation:  javac -d bin P1AnagramChecker.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P1AnagramChecker n
 *  
 *  Purpose: Determines whether two Strings are anagram or not
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class P1AnagramChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word to be checked");
		String word1 = sc.nextLine();
		System.out.println("Enter the second word to be checked");
		String word2 = sc.nextLine();
		int n1=word1.length();
		int n2=word2.length();
		int x=0;
		if(n1!=n2)
			System.out.println("Strings are not anagram");
		
		else
		{
			
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					if(word1.charAt(i)==word2.charAt(j))
					{
						x=1;
						break;
					}
				}
				if(x==0)
					System.out.println("Strings are not anagram");
			}
		}
		if(x==1)
			System.out.println("Strings are anagram");
		sc.close();
	}

}