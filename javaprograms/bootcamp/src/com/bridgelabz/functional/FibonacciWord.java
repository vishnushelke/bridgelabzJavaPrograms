package com.bridgelabz.functional;

public class FibonacciWord {

	public static void main(String[] args) {
		String s1="a";
		String s2="b";
		String s3="";
		System.out.print(s1+" "+s2+" ");
		for(int i=0;i<4;++i)
		{
		
		s3=s1+s2;
		s1=s2;
		s2=s3;
		System.out.print(s3+" ");
		}
		
	}

}
