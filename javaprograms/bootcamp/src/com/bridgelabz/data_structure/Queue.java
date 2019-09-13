package com.bridgelabz.data_structure;

public class Queue<T> {
	public Object queue[]=new Object [10];
	public int front,rear,size;
	
	public void enQueue(T data)
	{
		if(size>10)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[rear]=data;
			rear++;
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
			data=(T) queue[front];
			for(int i=front;i<=rear;i++)
			{
				queue[i]=queue[i+1];
			}
			queue[rear]=0;
			rear--;
			size--;
		}
	}

}
