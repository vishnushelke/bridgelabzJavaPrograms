package com.bridgelabz.data_structure;

public class LinkedList<T> {
	
	 Node<T> head;
	 
	 public void insert(T data)
	 {
		
		 Node<T> newnode= new Node<T>();
		 newnode.data=data;
		 
		 if(head==null)
		 {
			 head=newnode;
		 }
		 else
		 {
			 Node<T> n=head;
			 while(n.next!=null)
				 n=n.next;
			 n.next=newnode;
		 }
		
	 }
	 
	 public void insertAt(int position,T data)
	 {
		
		 Node<T> newnode=new Node<T>();
		 newnode.data=data;
		 
		 if(position==0)
		 {
			 newnode.next=head;
			 head=newnode;
		 }
		 else
		 {
			 Node<T> n=head;
			 for (int i = 0; i < position-1; i++) {
				n=n.next;
			}
			 newnode.next=n.next;
			 n.next=newnode;
			 
		 }
		 
	 }
	 
	 public void deleteAt(int position)
	 {
		
		 if(position==0)
		 {
			 head=head.next;
		 }
		 else
		 {
			 Node<T> newnode=new Node<T>();
			 Node<T> n=head;
			 for (int i = 0; i < position-1; i++) {
				n=n.next;
			}
			 newnode=n.next;
			 n.next=newnode.next;
			 newnode=null;
		 }
		
	 }
	 
	 
	 public void show()
	 {
		 Node<T> n=head;
		 while(n!=null)
		 {
			 System.out.print(n.data+" ");
			 n=n.next;
		 }
	 }

	

}
