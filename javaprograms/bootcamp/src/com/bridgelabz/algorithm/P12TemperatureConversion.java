/******************************************************************************
 *  Compilation:  javac -d bin P12TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.algorithm.P12TemperatureConversion n
 *  
 *  Purpose: Converts the temperature in centigrade to fehrenheit and vise versa
 *
 *  @author  Vishnu Shelke
 *  @version 1.0
 *  @since   09-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.algorithm;
import java.util.Scanner;
public class P12TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Whether input is c=0 or f=1?");
		int a=sc.nextInt();
		double c,f;
		
		if(a==0)
		{
			System.out.println("enter the value of temperature in degree centigrade");
			c=sc.nextDouble();
			System.out.println("given value of temperature in degree centigrade is "+c);
			f=32+(c*9)/5;
			System.out.println("required value of temperature in degree fehrenheit is "+f);
		}
		else
		{
			System.out.println("enter the value of temperature in degree fehrenheit");
			f=sc.nextDouble();
			System.out.println("given value of temperature in degree centigrade is "+f);
			c=(f-32)*5/9;
			System.out.println("required value of temperature in degree centigrade is "+c);
		}
		sc.close();
	}

}
