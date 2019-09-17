package com.bridgelabz.data_structure;

import com.bridgelabz.utility.Utility;

public class P14AnagramUsingQueue {
	public static void main(String[] args)
	{
		Queue<Integer> queue=new Queue<Integer>();
		for(int i=0;i<1000;i++) 
		{
			if(Utility.isPrime(i)) 
			{
				String s1=String.valueOf(i);
				for(int j=0;j<1000;j++)
				{
					if(Utility.isPrime(j))
					{
						String s2=String.valueOf(j);
						if(Utility.isAnagram(s1, s2))
						{
							queue.enQueue(i);
						}
					}
				}
			}
			
			
		}
		
		queue.show();
		
	}
}
