/******************************************************************************
 *  Compilation:  javac -d bin P5PalindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P5PalindromeChecker n
 *  
 *  Purpose: Checks whether given string is palindrome or not.
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;
import java.util.*;
public class P5PalindromeChecker {

	public static void main(String[] args) {
		LinkedList<Character> list=new LinkedList<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be checked");
		String s=sc.nextLine();
		String front="",back="";
		int n=s.length();
		for (int i = 0; i < s.length(); i++) {
			list.insert(s.charAt(i));
		}
		
		Node<Character> node=new Node<Character>();
		Node<Character> last=list.head;
		
		
		for (int i = 0; i < s.length(); i++) {
			last=list.head;
			int j=0;
			while(j<n-1) 
			{
				last=last.next;
				j++;
			}
			back=back+last.data;
			n--;
			j=0;
		}
		Node<Character> first=list.head;
		for (int i = 0; i < s.length(); i++) {
			front=front+first.data;
			first=first.next;
		}
		if(front.equals(back))
		{
			System.out.println("String is a Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
	}

}
