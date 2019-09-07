package com.bridgelabz.fellowship;

public class LinkedListString {

	static NodeS head;
	public static void insert(String data)
	{
		NodeS newnode= new NodeS();
		newnode.data=data;
		
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			NodeS n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			newnode.next=n.next;
			n.next=newnode;
		}
		
		
	}
	
	public static LinkedListString deleteAt(LinkedListString list,int index)
	{
		
		NodeS n=new NodeS();
		NodeS newnode=head;
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				newnode=newnode.next;
			}
			n=newnode.next;
			newnode.next=n.next;
		}
		return list;
	}
	public static void show()
	{
		NodeS newnode=head;
		while(newnode!=null)
			{
				System.out.print(newnode.data+" ");
				newnode=newnode.next;
			}
	}
	public static void main(String []args)
	{
//		LinkedListString list=new LinkedListString();
//		insert("vishnu");
//		insert("vishnu");
//		insert("vishnu");
//		insert("vishnu");
//		insert("vishnu");
//		insert("vishnu");
//		deleteAt(list,2);
//		show();
	}
}
