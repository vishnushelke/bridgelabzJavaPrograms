/******************************************************************************
 *  Compilation:  javac -d bin P2FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.functional.P2FlipCoin n
 *  
 *  Purpose: Perform coin flip n times and finds percentage of head vs tail
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.Random;
public class P2FlipCoin {

	public static void main(String[] args) {
		Random rand=new Random();
		int HQ=0,TQ=0;
		
		for(int i=0;i<25;i++)
		{
		int side=rand.nextInt(2);
		if(side==0)
		{
			System.out.println("HEADS");
			
			HQ++;
		}
		else
		{
			System.out.println("TAILS");
			
			TQ++;
		}
		}
		System.out.println("Number of HEADS is "+HQ);
		System.out.println("Number of TAILS is "+TQ);
		System.out.println("Percentage of HEADS is "+(HQ*100)/(TQ+HQ));
		System.out.println("Percentage of TAILS is "+(TQ*100)/(HQ+TQ));
	}

}
