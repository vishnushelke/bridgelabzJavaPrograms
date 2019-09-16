package com.bridgelabz.data_structure;
import java.io.*;
import java.util.*;
public class P6Hashing {

	public static void main(String[] args) throws IOException {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		//Taking 10 numbers from user
		File f=new File("/home/user/Desktop/vishnu/input for programs/hashing.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		Scanner sc=new Scanner(f);
		
		
		for (int i = 0; i < 10; i++) {
			int n=sc.nextInt();
			list.insert(n);
		}
		list.show();
		
		//creating a list for storing numbers
		LinkedList<Integer> hash=new LinkedList<Integer>();
		
	}

}
