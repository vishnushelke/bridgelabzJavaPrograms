/******************************************************************************
 *  Compilation:  javac -d bin P1StringReplace.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P1StringReplace n
 *  
 *  Purpose: Replaces the name in a string and prints
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
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
