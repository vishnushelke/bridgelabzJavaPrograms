package com.bridgelabz.data_structure;

public class HashingList {
	
	static LinkedList<Integer> hash=new LinkedList<Integer>();
	static int key,size=0;
	
	public static int size()
	{
		Node<Integer> node=hash.head;
		while(node.next!=null)
		{
			size++;
			node=node.next;
		}
		return size;
	}
	
	public static void createList(int len)
	{
		for (int i = 0; i < len; i++) {
			hash.insert(i);
		}
	}
	
	public static int key(int data)
	{
		key=data%11;
		return key;
	}
	
	public static void insertHash(LinkedList<Integer> list,int data)
	{
		int key=key(data);
		Node<Integer> node=hash.head;
		int found=0;
		while(node.next!=null)
		{
			if(node.data==key)
			{
			
				if(node==null)
				{
					LinkedList<Integer> nextList=new LinkedList<Integer>();
					Node<Integer> n=list.head;
					n.data=data;
				}
				else
				{
					
					Node<Integer> n=list.head;
					while(n.next!=null)
					{
						n=n.next;
					}
					Node<Integer> newnode=new Node<Integer>();
					newnode.data=data;
					n.next=newnode;
				}
				found=1;
				break;
			}
			else
			{
				node=node.next;
			}
		}
	}
	
	

	public static void main(String[] args) {
		createList(11);
		hash.show();
		insertHash(hash,33);
		hash.show();
	}

}
