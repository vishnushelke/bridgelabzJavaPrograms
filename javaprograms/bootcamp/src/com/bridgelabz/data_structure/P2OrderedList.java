/******************************************************************************
 *  Compilation:  javac -d bin P2OrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P2OrderedList n
 *  
 *  Purpose: Takes unOrdered,Sorts the list and searches the word taking from User.
 *  		 if found,deletes that word else inserts it into list at appropriate location. 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;
import java.io.*;
import java.util.*;
public class P2OrderedList {

	public static void sort(LinkedList<Integer> list)
	{
		int temp=0;
		for (Node<Integer> j = list.head; j!=null; j=j.next) {
			for (Node<Integer> j2 = j.next; j2!=null; j2=j2.next) {
				if(j.data>j2.data)
				{
					temp=j.data;
					j.data=j2.data;
					j2.data=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> list=new LinkedList<Integer>();
		File f=new File("/home/user/Desktop/vishnu/input for programs/Ordered.txt");
		
		//Created Linked List
		int[] num=new int[8];
		Scanner sc=new Scanner(f);
		Scanner sc1=new Scanner(System.in);
		
		for (int j = 0; j < num.length; j++) {
			num[j]=sc.nextInt();
		}
		for (int j = 0; j < num.length; j++) {
			list.insert(num[j]);
		}
		sort(list);

		System.out.println("Sorted List is :");
		list.show();
		System.out.println();
		System.out.println("Enter the Number to be Searched");
		int search=sc1.nextInt();
		int pos=0,x=0;
		for (Node<Integer> i = list.head; i.next!=null; i=i.next) {
			if(i.data==search)
			{
				System.out.println("Deleting "+search+" .....");
				list.deleteAt(pos);
				x=1;
				break;
			}
			else
			{
				pos++;
			}
		}
		if(x==0)
		{
			System.out.println("Inserting "+search+" .....");
			list.insert(search);
		}
		sort(list);
		list.show();
	}

}
