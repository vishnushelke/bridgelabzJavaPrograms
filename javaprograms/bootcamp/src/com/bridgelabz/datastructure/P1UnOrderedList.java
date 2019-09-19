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
package com.bridgelabz.datastructure;

import java.io.*;
import java.util.*;

import com.bridgelabz.utility.Utility;

public class P1UnOrderedList {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String[] s1 = null;
		String s = Utility.reader("/home/user/Desktop/vishnu/input for programs/unOrdered.txt");

		s1 = s.split(" ");

		// Created object of a Generic LinkedList
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < s1.length; i++) {
			list.insert(s1[i]);

		}

		// Printing LinkedList
		System.out.println("List is :");
		list.show();

		// Taking Input to be searched in list
		System.out.println();
		System.out.println("Enter the Word to be searched");
		String search = sc.nextLine();
		int i = 0, x = 0;
		Node<String> newnode = list.head;
		while (newnode != null) {
			if (newnode.data.equals(search)) {
				System.out.println("Deleting...");
				list.deleteAt(i);
				x = 1;
				break;
			} else {
				i++;
				newnode = newnode.next;
			}
		}
		if (x == 0) {
			System.out.println("Inserting...");
			list.insert(search);
		}
		String answer="";
		
		list.show();
		Node<String> node=list.head;
		while(node!=null)
		{
			answer=answer+node.data;
		}
		System.out.println("Writing in file ...");
		Utility.writer("/home/user/Desktop/vishnu", answer);
		sc.close();
	}

}
