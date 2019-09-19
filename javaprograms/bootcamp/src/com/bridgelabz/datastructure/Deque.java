package com.bridgelabz.datastructure;

public class Deque<T> {

	Object deque[]=new Object[10];
	int front;
	int rear;
	int size;
	
	public void insertFromFront(T data)
	{
		if(size==10)
		{
			System.out.println("Queue is Full now!");
		}
		else
		{
			deque[front]=data;
			size++;
			
		}
	}
	public void insertFromRear(T data)
	{
		if(size==10)
		{
			System.out.println("Queue is Full now!");
		}
		else
		{
			deque[rear]=data;
			size++;
			rear++;
		}
	}
	
	public T deleteFromFront()
	{
		T data=null;
		if(size==0)
		{
			System.out.println("Queue is empty now!");
		}
		else
		{
			data=(T) deque[front];
			for (int i = front; i < rear; i++) {
				deque[i]=deque[i+1];
			}
			deque[rear]=null;
			size--;
			
		}
		return data;
	}
	public T deleteFromRear()
	{
		T data=null;
		if(size<=0)
		{
			System.out.println("Queue is empty now!");
		}
		else
		{
			data=(T) deque[rear];
			deque[rear]=null;
			rear--;
			size--;
		}
		return data;
	}
	public int size() {
		return size;
	}
	public void show()
	{
		for (int i = front; i <= rear; i++) {
			System.out.print(deque[i]+" ");
		}
	}
}
