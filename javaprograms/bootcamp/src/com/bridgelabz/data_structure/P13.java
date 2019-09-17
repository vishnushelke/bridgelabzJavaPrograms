package com.bridgelabz.data_structure;

import com.bridgelabz.utility.Utility;

public class P13 {
	public static void main(String[] args)
	  {   int start=0;
	      int end=1000;
		  Stack<Integer> stack=new Stack<Integer>();
		  Stack<Integer> stack1=new Stack<Integer>();
	      
		  for (int i = start; i <= end; i++) {
					if (Utility.isPrime(i)) 
					{
						String s1=String.valueOf(i);
						for (int j= i+ 1; j < end; j++)
						{
							if (Utility.isPrime(j)) 
							{
								String s2=String.valueOf(j);
								if (Utility.isAnagram(s1, s2)){
		                            stack.push(i);
									
								    }
							}
						}
				
					}
		         }
	  
	      int size=stack.size();
	      
	      for(int i=0;i<size;i++)
	      {
	    	  stack1.push(stack.pop());
	    	  
	      }
	    		stack1.show();;  
	  
	  }

}
