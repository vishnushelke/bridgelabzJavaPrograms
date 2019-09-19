/******************************************************************************
 *  Compilation:  javac -d bin P13AnagramUsingStack.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P13AnagramUsingStack n
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

public class P13AnagramUsingStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i <= 1000; i++) {
			// checking if number is prime
			if (Utility.isPrime(i)) {
				String s1 = String.valueOf(i);

				// Searching for an anagram prime of that number
				for (int j = 0; j < 1000; j++) {
					if (Utility.isPrime(j)) {
						String s2 = String.valueOf(j);
						// if found,printing the number
						if (Utility.isAnagram(s1, s2)) {
							stack.push(i);
							break;
						}
					}
				}

			}
		}

		stack.show();

	}

}
