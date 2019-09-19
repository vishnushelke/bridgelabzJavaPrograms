package com.bridgelabz.datastructure;

public class Stack<T> {
	
	LinkedList<T> list=new LinkedList<T>();
	int top,size,rear;
	Node<T> head=list.head;

	public void push(T data)
	{
		list.insertAtStart(data);
		size++;
	}
	
	public T pop()
	{
		T data;
		data=list.deleteAtStart();
		return data;
	}
	public int size()
	{
		size=0;
		Node<T> n=list.head;
		while(n.next!=null)
		{
			size++;
			n=n.next;
		}
		return size;
	}
	
	public void show()
	{
		Node<T> n=list.head;
		if(list.head==null)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
		 
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
		
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		
		s.push(23);
		//s.pop();
		System.out.println(s.pop());

		
		s.show();
	}

}
