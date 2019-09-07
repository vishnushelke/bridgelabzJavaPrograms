package com.bridgelabz.fellowship;

public class Stack1 {
	static int[] stack=new int[5];
	static int top=-1;
	
	public static void push(int data)
	{
		if(top>5)
		{
			System.out.println("Stack memory is full");
		}
		else
		{
			top++;
			stack[top]=data;
		}
	}
	
	public static int pop()
	{
		int data=0;
		if(top<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			data=stack[top];
			stack[top]=0;
			top--;
			//System.out.println("poped element is "+data);
		}
		return data;
	}
	public static int peek()
	{
		int data=0;
		if(top<1)
		{
			System.out.println("can't peek as stack have only 1 valu now");
		}
		else
		{
			data=stack[top-1];
		}
		return data;
	}
	
	public static void show()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print(stack[i]+" ");
		}
	}

	public static void main(String args[])
	{
		push(5);
		push(15);
		push(50);
		push(56);
		push(97);
		show();
		System.out.println();
		int data1=peek();
		System.out.println("Peeked element is "+data1);
		
		int data=pop();
		System.out.println("popped element is "+data);
		show();
	}
}
