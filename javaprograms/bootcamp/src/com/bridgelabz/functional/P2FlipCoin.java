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
