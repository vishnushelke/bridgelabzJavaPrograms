/******************************************************************************
 *  Compilation:  javac -d bin P13StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P13StopWatch n
 *  
 *  Purpose: Calculates time required to execute the program code
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Random;
import com.bridgelabz.utility.Utility;
public class P13StopWatch {
	public static void main(String[] args) throws InterruptedException {
		
		Utility.start();
		Random r= new Random();
		int a=r.nextInt(6)+1;
		
		int b=r.nextInt(6)+1;
		System.out.println("reuired addition is "+(a+b));
		Utility.end(Utility.start());
	}

}
