package com.bridgelabz.fellowship;
import java.util.*;
import java.io.*;
public class SortedSearchList {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/admin1/Desktop/vishnu/text files of java programs/SortedList.txt");
//		FileReader fr=new FileReader(f);
//		BufferedReader br=new BufferedReader(fr);
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
		LinkedList1.show();
		
		//for Sorting the list
		int temp=0;
		Node n=LinkedList1.head;
		Node n1=n.next;
		for(int i=0;i<6;i++)
		{
			for(int j=1;j<j-i-1;j++)
			{
				if(n.data>n1.data)
				{
					temp=n.data;
					n.data=n1.data;
					n1.data=n.data;
				}
				n1=n1.next;
			}
			n=n.next;
		}
		System.out.println();
		LinkedList1.show();
		
	}

}
