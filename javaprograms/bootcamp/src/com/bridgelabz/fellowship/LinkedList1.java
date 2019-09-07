package com.bridgelabz.fellowship;

public class LinkedList1 
{
	static Node head;
	
	public static void insert(int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=newnode;
		}
	}
	
	public static void insertAtStart(int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=head;
		head=newnode;
	}
	
	public static void insertAt(int index,int data)
	{
		Node newnode=new Node();
		newnode.data=data;
		if(index==0)
		{
			newnode.next=head;
			head=newnode;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{ 
				n=n.next;
			}
			
			newnode.next=n.next;
			n.next=newnode;
			
		}
	}
	
	public static void show()
	{
		Node newnode=head;
		while(newnode!=null)
		{
			System.out.print(newnode.data+" ");
			newnode=newnode.next;
		}

	}
	
	
	
	public static void deleteAt(int index)
	{
	
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			Node last=new Node();
			last=n.next;
			n.next=last.next;
			last=null;
		}
	}
	
	//Main Method starts here!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	
	public static void main(String []args)
	{
		LinkedList1 list=new LinkedList1();
		list.insert(5);
		list.insert(6);
		list.insert(12);
		list.insert(56);
		list.insert(66);
		insertAtStart(33);
		insertAt(4,44);
		list.show();
		System.out.println();
		deleteAt(4);
		list.show();
	}
}
