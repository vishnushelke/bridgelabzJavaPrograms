package com.bridgelabz.data_structure;
import java.util.*;
public class P5PalindromeChecker {

	public static void main(String[] args) {
		Deque<Character> d=new Deque<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to be checked");
		String s=sc.nextLine();
		String front="",back="";
		int n=s.length();
		for (int i = 0; i < s.length(); i++) {
			d.insertFromFront(s.charAt(i));
		}
		d.show();
//		for (int i = 0; i < s.length(); i++) {
//			front=front+d.deleteFromFront();
//		}
//		for (int i = 0; i < s.length(); i++) {
//			back=back+d.deleteFromRear();
//		}
//		System.out.println(front+" "+back);
	}

}
