/******************************************************************************
 *  Compilation:  javac -d bin P2PrimeNumbers1000.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P2PrimeNumbers1000 n
 *  
 *  Purpose: Finds the Prime Numbers upto 1000
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class P11PrimeNumbers1000 {

	public static void main(String[] args) {

		int start = 0;
		int end = 100;


		int[][] primeNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (Utility.isPrime(j)) {
					j1++;
				}
			}
			primeNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;
			

		}
		start = 0;
		end = 100;
		//putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {

				if (Utility.isPrime(j)) {
					primeNumber[i][j2] = j;
					j2++;
				}

			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
//		for (int i = 0; i < primeNumber.length; i++) {
//			for (int j = 0; j < primeNumber[i].length; j++)
//				System.out.print(primeNumber[i][j] + " ");
//			System.out.println();
//		}
		for (int i = 0; i < primeNumber.length; i++) {
			System.out.print(primeNumber[i].length+" ");
		}
	}

}