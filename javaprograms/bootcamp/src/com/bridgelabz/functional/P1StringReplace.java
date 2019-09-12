package com.bridgelabz.functional;
import java.util.*;
public class P1StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		String s="Hello <<UserName>>, How are you?";
		String s1=s.replace("<<UserName>>", name) ;
		System.out.println(s1);
	}

}
