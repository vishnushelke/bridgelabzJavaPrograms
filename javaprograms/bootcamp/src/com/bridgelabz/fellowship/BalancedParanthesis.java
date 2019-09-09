package com.bridgelabz.fellowship;
import java.io.*;
public class BalancedParanthesis {
	public static char[] stack=new char[10];
	public static int top=0;
	public static void push()
	{
		if(top>9)
		{
			System.out.println("Stack memory is full now");
		}
		else
		{
			
			stack[top]='(';
			top++;
			
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
			
			char data=stack[top];
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
		int len=x.length();
		int n=0;
		for(int i=0;i<len;i++)
		{
			if(x.charAt(n)=='(')
			{
				push();
				n++;
			}
			else if(x.charAt(n)==')')
			{
				pop();
				n++;
			}
			else n++;
		}
		System.out.println(isEmpty());
	}

}
