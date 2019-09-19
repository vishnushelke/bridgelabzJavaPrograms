
package com.bridgelabz.datastructure;

public class StackUsingArrays<T> {

	Object stack[]=new Object [6];
	public static int top;
	public void push(T data)
	{
		stack[top]=data;
		top++;
	}
	public void pop()
	{
		//System.out.println("popped element is + "+stack[top]);
		stack[top]=0;
		for (int i = top; stack[i]!=null; i++) {
			stack[i]=stack[i-1];
		}
		
		top--;
		
	}
	public void peek()
	{
		T data;
		data=(T)stack[top-1];
		System.out.println("Peeked Element is : "+data);
	}
	
	public static int size() {
		return top;
	}
	
	public static boolean isEmpty()
	{
		if(top==0)
			return true;
		else
			return false;
	}
}
