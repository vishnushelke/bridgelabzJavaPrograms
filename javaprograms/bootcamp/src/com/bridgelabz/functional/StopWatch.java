package com.bridgelabz.functional;
import java.util.Random;
import com.bridgelabz.utility.Utility;
public class StopWatch {
	public static void main(String[] args) throws InterruptedException {
		
		Utility.start();
		Random r= new Random();
		int a=r.nextInt(6)+1;
		
		int b=r.nextInt(6)+1;
		System.out.println("reuired addition is "+(a+b));
		Utility.end(Utility.start());
	}

}
