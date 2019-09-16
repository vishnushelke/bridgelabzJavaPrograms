package com.bridgelabz.data_structure;

public class Queue<T> {
	LinkedList<T> list=new LinkedList<T>();
	public int size;
	Node<T> head=list.head;
	
	public void enQueue(T data)
	{
		if(size>39)
		{
			System.out.println("Queue is full");
		}
		else
		{
			list.insert(data);
			size++;
		}
		
	}
	public void deQueue()
	{
		if(size==0)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			T data;
			Node<T> node=list.head;
			data=node.data;
			head=head.next;
			node=null;
			size--;
		}
	}
	
	public void show()
	{
		if(size==0)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			
			Node<T> node=list.head;
			while(node!=null) {
			System.out.print(node.data);
			node=node.next;
			}
		}
	}

}
