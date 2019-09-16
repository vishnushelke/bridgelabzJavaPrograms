package com.bridgelabz.data_structure;

public class Stack<T> {
	
	LinkedList<T> list=new LinkedList<T>();
	int top,size,rear;
	Node<T> head=list.head;

	public void push(T data)
	{
		list.insert(data);
		size++;
	}
	
	public T pop()
	{
		int x=0;
		T data;
		Node<T> n=new Node<T>();
		while(n.next!=null)
		{
			x++;
			n=n.next;
		}
		data=n.data;
		list.deleteAt(x+1);
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
		System.out.println(s.pop());

		
		s.show();
	}

}
