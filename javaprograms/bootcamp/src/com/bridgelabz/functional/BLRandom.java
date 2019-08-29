package com.bridgelabz.functional;
import java.util.*;
public class BLRandom {
	
	public static void setSeed(long seed)
	{
		long s=1;
		seed=s;
	}
	
	public static int uniform(int n)
	{
		int g=0;
		Random random=new Random();
		if(n<0) throw new IllegalArgumentException("Argument must be positive");
		else g=random.nextInt(n-1);
		System.out.println(g);
		return g;
	}
	
	public static double uniform1(double lo,double hi)
	{
		if(!(lo<hi)) throw new IllegalArgumentException("Range is invalid");
		else {
			double h=0.0;
			Random rand=new Random();
			h=rand.nextDouble()*(hi-lo);
			System.out.println(h);
			return h;
		}
	}

	public static boolean bernoulli(double p)
	{
		boolean i=false;
		if(p>=1 || p<=0)throw new IllegalArgumentException("Probability must lie between 0 and 1");
		else 
			{
			i=true;
			System.out.println(i);
			}
		return i;
			}
			
	
	
	public static double gaussian()
	{
		double r, x, y;
        do {
            x = uniform1(-1.0, 1.0);
            y = uniform1(-1.0, 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);
	}
	
	 public static double gaussian(double mu, double sigma) {
	        return mu + sigma * gaussian();
	    }
	 
	  public static int discrete(double[] probabilities) {
		  	Random rand=new Random();
	        if (probabilities == null) throw new IllegalArgumentException("argument array is null");
	        double EPSILON = 1.0E-14;
	        double sum = 0.0;
	        for (int i = 0; i < probabilities.length; i++) {
	            if (!(probabilities[i] >= 0.0))
	                throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
	            sum += probabilities[i];
	        }
	        if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
	            throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

	        while (true) {
	            double r =rand.nextDouble();;
	            sum = 0.0;
	            for (int i = 0; i < probabilities.length; i++) {
	                sum = sum + probabilities[i];
	                if (sum > r) return i;
	            }
	        }
	    }
	  
	  public static void shuffle(double[] a) {
	       
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	        	 if(a[i]==0)throw new IllegalArgumentException("a should not be 0");
	            int r = i + uniform(n-i);     // between i and n-1
	            double temp = a[i];
	            a[i] = a[r];
	            a[r] = temp;
	        }
	    }

	public static void main(String[] args) {
		int s=0;
		setSeed(s);
		System.out.println(s);
		
		uniform(5);
		System.out.println();
		 uniform1(1.0,6.0);
		 System.out.println();
		 
		bernoulli(0.555);
		System.out.println();
		gaussian(5,7);
		System.out.println();
		double a[]= {1,2,3,55,7};
		shuffle(a);
		System.out.print(a);
		 
	}

}
