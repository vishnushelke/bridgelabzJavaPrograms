/******************************************************************************
 *  Compilation:  javac -d bin P3SimpleParanthesis.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P3SimpleParanthesis n
 *  
 *  Purpose: Takes equation as input and checks if all brackets are closed 
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;
import java.io.*;
public class P3SimpleParanthesis {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		LinkedList<Character> list=new LinkedList<Character>();
		File f=new File("/home/user/Desktop/vishnu/input for programs/SimpleParanthesis.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		int y=0;
		String s=br.readLine();
		System.out.println(s);
		int n=s.length();
		for (int i = 0; i < n; i++) {
			y=0;
			if(s.charAt(i)=='(')
			{
				list.insert('(');
			}
			else if(s.charAt(i)==')')
			{
				if(list.deleteAtBooleanReturn(0)) {
					list.deleteAt(0);
					y=1;
				}
			}
		}
		Node<Character> node=list.head;
		int x=0;
		while(node!=null)
		{
			x++;
			node=node.next;
		}
		
		if(x==0 && y==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
