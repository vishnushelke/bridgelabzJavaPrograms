package com.bridgelabz.fellowship;

public class LinkedList {
	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	static Node head;
	
	public static LinkedList insert(LinkedList list,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		return list;
	}
	
	public static void insertAtStart(int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		newnode.next=head;
		head=newnode;
	}
	
	public static void insertAtLocation(int location,int data)
	{
		Node newnode=new Node(data);
		newnode.next=null;
		
		Node n=head;
		for(int i=0;i<location-1;i++)
		{
			n=n.next;
		}
		newnode.next=n.next;
		n.next=newnode;
	}
	
	public static void printlist(LinkedList list)
	{
		Node curnode=head;
		while(curnode.next!=null)
		{
			System.out.print(curnode.data+"->");
			curnode=curnode.next;
		}
		System.out.print(curnode.data);
	}

	public static void main(String[] args) {

		LinkedList list=new LinkedList();
		list=insert(list,1);
		list=insert(list,4);
		list=insert(list,5);
		list=insert(list,3);
		list=insert(list,7);
		list=insert(list,9);
		list=insert(list,8);
		insertAtStart(25);
		insertAtLocation(2,55);
		
		printlist(list);
	}

}
