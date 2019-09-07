package com.bridgelabz.fellowship;

import java.io.*;
import java.util.*;

public class UnSorted {

	public static void main(String[] args) throws IOException {
		File f=new File("/home/admin1/Desktop/vishnu/text files of java programs/unOrdered.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String name[]=new String[7];
		String x="";
		while((x=br.readLine())!=null)
		{
			name=x.split(" ");
		}
		LinkedListString list=new LinkedListString();
	
		
		for(int i=0;i<7;i++)
			LinkedListString.insert(name[i]);
	    list.show();
	    System.out.println();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name you wish to search");
	    String search=sc.nextLine();
	    NodeS n=LinkedListString.head;
	    int y=0;
	    for(int i=0;i<7;i++)
	    {
	    	if((n.data).equals(search))
	    	{
	    		LinkedListString.deleteAt(list, i);
	    		y=1;
	    		break;
	    	}
	    	else n=n.next;
	    	
	    }
	    if(y==0)
	    {
	    	LinkedListString.insert(search);
	    }
	    list.show();
	}
}
