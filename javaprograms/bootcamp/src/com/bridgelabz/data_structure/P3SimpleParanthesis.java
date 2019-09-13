/******************************************************************************
 *  Compilation:  javac -d bin P3SimpleParanthesis.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P3SimpleParanthesis n
 *  
 *  Purpose: Takes equation as input and checks if all brackets are closed 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;
import java.io.*;
public class P3SimpleParanthesis {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Stack<Character> stack=new Stack<Character>();
		File f=new File("/home/user/Desktop/vishnu/input for programs/SimpleParanthesis.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String s=br.readLine();
		System.out.println(s);
		int n=s.length();
		for (int i = 0; i < n; i++) {
			if(s.charAt(i)=='(')
			{
				stack.push('(');
			}
			else if(s.charAt(i)==')')
			{
				stack.pop();
			}
		}
		if(Stack.size()==0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
