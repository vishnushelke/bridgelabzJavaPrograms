package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class P3AnagramAndPalindromePrimeUpto1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility = new Utility();
		System.out.println("Prime Anagram");
		for (int i = 0; i < 1000; i++) {
			if (utility.isPrime(i)) {
				for (int j = i + 1; j < 1000; j++) {
					if (utility.isPrime(j)) {
						if (utility.isAnagram(String.valueOf(i), String.valueOf(j))) {
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
