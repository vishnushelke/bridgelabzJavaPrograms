/******************************************************************************
 *  Compilation:  javac -d bin P14AnagramUsingQueue.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P14AnagramUsingQueue n
 *  
 *  Purpose: Prints Anagram prime Numbers Upto 1000
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   17-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;

import com.bridgelabz.utility.Utility;

public class P14AnagramUsingQueue {
	public static void main(String[] args)
	{
		Queue<Integer> queue=new Queue<Integer>();
		
		//Looking for a prime number
		for(int i=0;i<1000;i++) 
		{
			if(Utility.isPrime(i)) 
			{
				String s1=String.valueOf(i);
				
				//Looking for an anagram prime of the number
				for(int j=0;j<1000;j++)
				{
					if(Utility.isPrime(j))
					{
						String s2=String.valueOf(j);
						
					//	if found,printing a number
						if(Utility.isAnagram(s1, s2))
						{
							queue.enQueue(i);
							break;
						}
					}
				}
			}
			
			
		}
		
		queue.show();
		
	}
}
