package task;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class TicToeGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=4,c=0;
		
		String  a[][]=new String[3][3];
		
		
		
		
		//1	
		while(x>0) {
			System.out.println("Enter row number m and column number n to insert x");
			int m=sc.nextInt();
			int n=sc.nextInt();
			if(a[m][n]=="X" || (a[m][n]=="O"))
			{
				System.out.println("this space is not empty, enter another value of m,n");
				m=sc.nextInt();
				n=sc.nextInt();

			}
			a[m][n]="X";
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(a[i][j]=="X" || (a[m][n]=="O")) 
						c = 1;
					else a[i][j]="0";
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			//Random rand=new Random();
			m=(int)Math.random()*3;
			n=(int)Math.random()*3;
			do
				{
				m=(int)Math.random()*3;
				n=(int)Math.random()*3;
				}
			while((a[m][n]!="O") || (a[m][n]!="X"));
			a[m][n]="O";
			for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				if(a[i][j]=="X" || (a[m][n]=="O")) 
					c = 1;
				else a[i][j]="0";
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
			}
			x--;
		}
		//final
		System.out.println("Enter row number m and column number n to insert x");
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(a[m][n]=="X")
		{
			System.out.println("this space is not empty, enter another value of m,n");
			m=sc.nextInt();
			n=sc.nextInt();

		}
		a[m][n]="X";
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]=="X" || (a[m][n]=="O")) 
					c = 1;
				else a[i][j]="0";
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		/*	//2
			System.out.println("Enter row number m and column number n to insert x");
			m=sc.nextInt();
			n=sc.nextInt();
			if(a[m][n]=="X")
			{
				System.out.println("this space is not empty");

			}
			else a[m][n]="X";
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					
					
					if(a[i][j]!="X") a[i][j]="0";
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			m=rand.nextInt(3);
			n=rand.nextInt(3);
			while(a[m][n]!="X")
				{
					m=rand.nextInt(3);
					n=rand.nextInt(3);
				}
			a[m][n]="X";
			for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
	
				if(a[i][j]!="X") a[i][j]="0";
				
				
				
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
			}
			//3
			System.out.println("Enter row number m and column number n to insert x");
			m=sc.nextInt();
			n=sc.nextInt();
			if(a[m][n]=="X")
			{
				System.out.println("this space is not empty");

			}
			else a[m][n]="X";
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					
					
					if(a[i][j]!="X") a[i][j]="0";
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			m=rand.nextInt(3);
			n=rand.nextInt(3);
			while(a[m][n]!="X")
				{
					m=rand.nextInt(3);
					n=rand.nextInt(3);
				}
			a[m][n]="X";
			for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
	
				if(a[i][j]!="X") a[i][j]="0";
				
				
				
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
			}
			//4
			System.out.println("Enter row number m and column number n to insert x");
			m=sc.nextInt();
			n=sc.nextInt();
			if(a[m][n]=="X")
			{
				System.out.println("this space is not empty");

			}
			else a[m][n]="X";
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					
					
					if(a[i][j]!="X") a[i][j]="0";
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			
			m=rand.nextInt(3);
			n=rand.nextInt(3);
			while(a[m][n]!="X")
				{
					m=rand.nextInt(3);
					n=rand.nextInt(3);
				}
			a[m][n]="X";
			for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
	
				if(a[i][j]!="X") a[i][j]="0";
				
				
				
				System.out.print(" "+a[i][j]+" ");
			}
			System.out.println();
			}
			//5
			System.out.println("Enter row number m and column number n to insert x");
			m=sc.nextInt();
			n=sc.nextInt();
			if(a[m][n]=="X")
			{
				System.out.println("this space is not empty");

			}
			else a[m][n]="X";
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					
					
					if(a[i][j]!="X") a[i][j]="0";
					System.out.print(" "+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();*/
	}

}
