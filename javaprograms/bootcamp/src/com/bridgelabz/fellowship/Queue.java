package com.bridgelabz.fellowship;

public class Queue {
	
	public static int[] queue=new int[10];
	public static int size,front,rear;
	
	public static void enqueue(int data)
	{
		if(rear>9)
		{
			System.out.println();
			System.out.println("queue is full now");
		}
		else 
		{
			queue[rear]=data;
			rear++;
		}
	}
	
	public static int dequeue()
	{
		int data=0;
		if(front<0)
		{
			System.out.println("Queue is empty now");
		}
		else {
			data=queue[front];
			front++;
			for(int i=0;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			queue[rear-1]=0;
			rear--;
			System.out.println("Removed Element is "+data);
			}
		return data;
	}
	
	public static void show()
	{
		System.out.print("Queue is : ");
		for(int i=0;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		enqueue(5);
		enqueue(53);
		enqueue(25);
		enqueue(54);
		enqueue(65);
		dequeue();
		enqueue(90);
		show();
		enqueue(90);
		dequeue();
		show();
	}

}
