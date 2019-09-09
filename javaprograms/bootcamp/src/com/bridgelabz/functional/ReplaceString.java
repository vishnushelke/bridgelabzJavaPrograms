package com.bridgelabz.functional;
import java.util.Scanner;
public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		String temp="Hello <<UserName>>, How are you?";
		
		String s=temp.replace("<<UserName>>", name);
		System.out.println(s);
	}

}
