package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers1000 {

	public static void main(String[] args) {
//
//		int start = 0;
//		int end = 100;
//
//
//		int[][] primeNumber = new int[10][];
//
//		int j1 = 0, j2 = 0;
//		// declaration of array is done
//		for (int i = 0; i < 10; i++) {
//			for (int j = start; j <= end; j++) {
//				if (Utility.isPrime(j)) {
//					j1++;
//				}
//			}
//			primeNumber[i] = new int[j1];
//			start = end + 1;
//			end += 100;
//			j1 = 0;
//			
//
//		}
//		start = 2;
//		end = 100;
//		//putting values in array
//		for (int i = 0; i < 10; i++) {
//			for (int j = start; j <= end; j++) {
//
//				if (Utility.isPrime(j)) {
//					primeNumber[i][j2] = j;
//					j2++;
//				}
//
//			}
//			start = end + 1;
//			end += 100;
//			j2 = 0;
//		}
//
//		// printing array
//		for (int i = 0; i < primeNumber.length; i++) {
//			for (int j = 0; j < primeNumber[i].length; j++)
//				System.out.print(primeNumber[i][j] + " ");
//			System.out.println();
//		}
//		//finding all anagrams upto 1000 and printing
//		System.out.println("Anagram numbers upto 1000 are ");
//		for(int i=2;i<1000;i++)
//		{
//			if(Utility.isPrime(i))
//			{
//				for(int j=i+1;j<1000;j++)
//				{
//					if(Utility.isPrime(j))
//					{
//						if(Utility.isAnagram(i, j))
//							System.out.println(i+" "+j);
//					}
//				}
//			}
//		}
//		
//		//finding palindromes upto 1000 and printing
//		System.out.println("palindrome numbers upto 1000 are ");
//		for(int i=10;i<1000;i++)
//		{
//			if(Utility.isPrime(i))
//			{
//				if(Utility.isPalindrome(i))
//				{
//					System.out.println(i);
//				}
//			}
//		}
//		
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
		System.out.println("Prime Palindrome");
		for (int i = 0; i < 1000; i++) {
			
			if (utility.isPrime(i) && utility.isPalindrome(i)&&i>9) {
				System.out.print(i+ " ");
			}
		}
	}

}