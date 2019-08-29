package com.bridgelabz.functional;
import java.util.*;
public class SineAndCosineOfAngle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the angle");
		double x=sc.nextDouble();
		x=Math.toRadians(x);
		x=x%(2*Math.PI);
		double b=0,y=0,c=0,z=0;
		
		for(int i=0;i<3;i++)
		{
			b=(Math.pow(-1, i)*Math.pow(x, (2*i+1)))/factorial(2*i+1);
			y=b+y;
			c=(Math.pow(-1, i)*Math.pow(x, (2*i)))/factorial(2*i);
			z=z+c;
		}
		System.out.println("Sin x= "+y);
		System.out.println("cos x= "+z);
		sc.close();
	}
	
	public static int factorial(int x)
	{
		int fact=1;
		for(int j=1;j<=x;j++)
		{
			fact=j*fact;
		}
		return fact;
	}

}
