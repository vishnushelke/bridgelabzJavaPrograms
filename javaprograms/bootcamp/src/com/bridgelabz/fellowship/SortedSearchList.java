package com.bridgelabz.fellowship;
import java.util.*;
import java.io.*;
public class SortedSearchList {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/admin1/Desktop/vishnu/text files of java programs/SortedList.txt");
		Scanner sc=new Scanner(f);
		int[] a=new int[6];
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		LinkedList1 list=new LinkedList1();
		for(int i=0;i<6;i++)
		{
			LinkedList1.insert(a[i]);
		}
		System.out.println("LinkedList is :");
		LinkedList1.show();
		
		//for Sorting the list
		int temp=0;
		
		for(Node i=LinkedList1.head;i!=null;i=i.next)
		{
		  for(Node j=i.next;j!=null;j=j.next)
		  {
			
				if((i.data>j.data))
				{
					temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
		  }	
		}
		
		System.out.println();
		System.out.println("Sorted LinkedList is:");
		LinkedList1.show();
		
		//Taking input from user to find and checking if it is present in list
		
		System.out.println();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number to be searched");
		int search=sc1.nextInt();
		Node n=LinkedList1.head;
		int x=0;
		for(int i=0;i<6;i++)
		{
			//if it is found then deleting it from list
			if(search==n.data)
			{
				LinkedList1.deleteAt(i);
				x=1;
				break;
			}
			else
			{
				n=n.next;
			}
			
		}
		if(x==0)
		{
			//if not found,inserting in list
			System.out.println("Number not found");
			LinkedList1.insert(search);
			//placing end element at right position by Sorting the list
			temp=0;
			
			for(Node i=LinkedList1.head;i!=null;i=i.next)
			{
			  for(Node j=i.next;j!=null;j=j.next)
			  {
				
					if((i.data>j.data))
					{
						temp=i.data;
						i.data=j.data;
						j.data=temp;
					}
			  }	
			}
		}
		//printing final list
		System.out.println("Final LinkedList is:");
		LinkedList1.show();
	}
}
