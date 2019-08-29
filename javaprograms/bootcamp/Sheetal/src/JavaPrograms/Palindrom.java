/*****************************************************************************************************
 * 
 * Purpose: To print Number is palindrom or not.
 * 
 *  @author bridgeLabz
 *  @version 1.0
 *  @since 22-08-2019
 *  
 *****************************************************************************************************/

package JavaPrograms;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		int n;
		int r;
		int result = 0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n = scanner.nextInt();
		while (n > 0) {
			r = n % 10;
			result = (result * 10) + r;
			n = n / 10;

		}
		if (result == n) {
			System.out.println("Number is palindrom");

		} else {
			System.out.println("Number is not palindrom");
		}

	}
}
