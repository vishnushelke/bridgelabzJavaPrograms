/******************************************************************************
 *  Compilation:  javac -d bin P12StringPermutation.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P12StringPermutation n
 *  
 *  Purpose: printing String Permutations Using Iterative and recursive approach
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   13-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class P12StringPermutation {

	static void recursiveivePermutn(String str, String ans) {

		if (str.length() == 0) {

			System.out.print(ans + " ");
			return;
		}

		boolean b[] = new boolean[26];

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);

			if (b[ch - 'a'] == false)
				recursiveivePermutn(ros, ans + ch);
			b[ch - 'a'] = true;
		}
	}

	public static void iterativePermutations(String str, int n) {

		char[] s = str.toCharArray();
		Arrays.sort(s);

		while (true) {

			System.out.print(String.valueOf(s) + " ");

			int i = n - 1;
			while (s[i - 1] >= s[i]) {

				if (--i == 0)
					return;
			}

			int j = n - 1;
			while (j > i && s[j] <= s[i - 1])
				j--;

			Utility.swap1(s, i - 1, j);

			Utility.reverse1(s, i, n - 1);
		}

	}

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println("String Permutation Using Recursive Method is :");
		recursiveivePermutn(s, "");
		System.out.println();
		System.out.println("String Permutation Using Iterative Method is :");
		iterativePermutations(s, s.length());
	}
}
