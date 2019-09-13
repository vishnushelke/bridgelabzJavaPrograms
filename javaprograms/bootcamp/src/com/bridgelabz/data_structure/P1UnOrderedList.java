/******************************************************************************
 *  Compilation:  javac -d bin P1UnOrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P1UnOrderedList n
 *  
 *  Purpose: Creates unOrdered and searches the word taking from User.
 *  		 if found,deletes that word else inserts it into list. 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;
import java.io.*;
import java.util.*;
public class P1UnOrderedList {
	
	

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File f=new File("/home/user/Desktop/vishnu/input for programs/unOrdered.txt");
		FileReader fr=new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		String []s1=null;
		String s="";
	
		while((s=br.readLine())!=null)
		{
			s1=s.split(" ");
		}

		//Created object of a Generic LinkedList
		LinkedList<String> list=new LinkedList<String>();
		for (int i = 0; i < s1.length; i++) {
			list.insert(s1[i]);
			
		}
		
		//Printing LinkedList
		list.show();
		
		//Taking Input to be searched in list
		System.out.println("Enter the Word to be searched");
		String search=sc.nextLine();
		int i=0,x=0;
		Node<String> newnode=list.head;
		while(newnode.next!=null)
		{
			if(newnode.data.equals(search))
			{
				System.out.println("Deleting...");
				list.deleteAt(i);
				x=1;
				break;
			}
			else
			{
				i++;
				newnode=newnode.next;
			}
		}
		if(x==0)
		{
			System.out.println("Inserting...");
			list.insert(search);
		}
		
		list.show();
			sc.close();		
	}

}
