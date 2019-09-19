/******************************************************************************
 *  Compilation:  javac -d bin P7BinarySearchTree.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P7BinarySearchTree n
 *  
 *  Purpose: calcultes number of possible binary trees can be made.
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   14-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.data_structure;

import java.util.*;

public class P7BinarySearchTree {
	long catalan(int n) {
		long res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		//finding result
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return (long) (res % (Math.pow(10, 8) + 7));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		P7BinarySearchTree cn = new P7BinarySearchTree();
		System.out.println("Total number of binary trees can be made are :" + cn.catalan(n));

	}

}
