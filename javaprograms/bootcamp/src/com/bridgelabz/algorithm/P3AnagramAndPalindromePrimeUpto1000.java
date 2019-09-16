/******************************************************************************
 *  Compilation:  javac -d bin P3AnagramAndPalindromePrimeUpto1000.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P3AnagramAndPalindromePrimeUpto1000 n
 *  
 *  Purpose: Finds the prime numbers upto 1000 which anagram to each other and palindromes
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class P3AnagramAndPalindromePrimeUpto1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime Anagram");
		for (int i = 0; i < 1000; i++) {
			if (Utility.isPrime(i)) {
				for (int j = i + 1; j < 1000; j++) {
					if (Utility.isPrime(j)) {
						if (Utility.isAnagram(String.valueOf(i), String.valueOf(j))) {
							System.out.println(i + " " + j);
						}
					}
				}
			}
		}
		System.out.println("Prime Palindromes Upto 1000 are :");
		for (int i = 0; i < 1000; i++) {
			
			if (Utility.isPrime(i) && Utility.isPalindrome(i)&&i>9) {
				System.out.print(i+ " ");
			}
		}
	}

}
