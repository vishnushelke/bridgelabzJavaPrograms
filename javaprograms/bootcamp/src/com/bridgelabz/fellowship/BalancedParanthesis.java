package com.bridgelabz.fellowship;
import java.io.*;
public class BalancedParanthesis {
	public static char[] stack=new char[10];
	public static int top=-1;
	public static void push()
	{
		if(top>9)
		{
			System.out.println("Stack memory is full now");
		}
		else
		{
			top++;
			stack[top]='(';
			
		}
	}
	
	public static void pop()
	{
		if(top<0)
		{
			System.out.println("Stack memory is empty,can't pop now");
		}
		else
		{
			char data=' ';
			data=stack[top];
			stack[top]=0;
			top--;	
		}
	}
	
	public static boolean isEmpty()
	{
		boolean b=false;
		if(top==0)
			b=true;
		return b;
	}

	public static void main(String[] args) throws IOException {
		
		File f=new File("/home/admin1/Desktop/vishnu/text files of java programs/paranthesis.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String x="";
		x=br.readLine();
		System.out.println(x);
		int n=0;
		while(x.charAt(n)!=-1)
		{
			if(x.charAt(n)=='(')
			{
				push();
			}
			else if(x.charAt(n)==')')
			{
				pop();
			}
		}
		System.out.println(isEmpty());
	}

}
