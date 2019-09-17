package com.bridgelabz.data_structure;
import java.util.*;

public class P7BinarySearchTree {
	long catalan(int n) { 
        long res = 0; 
          
        // Base case 
        if (n <= 1) { 
            return 1; 
        } 
        for (int i = 0; i < n; i++) { 
            res += catalan(i) * catalan(n - i - 1); 
        } 
        return (long) (res%(Math.pow(10, 8)+7)); 
    } 
  
    public static void main(String[] args) { 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int n=sc.nextInt();
    	P7BinarySearchTree cn = new P7BinarySearchTree(); 
       
    	   System.out.print(cn.catalan(n) + " "); 
	
           
        
    } 

}
