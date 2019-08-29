package com.bridgelabz.functional;
import java.util.Scanner;
public class PrintInitials {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		String name= sc.nextLine();
		char s= name.charAt(0);
		
		switch(s)
		{
		case 'k': 
			for(int i=0;i<=9;i++)
			{
				for(int j=0;j<=14;j++)
				{
				if(((i==0) || (i==8)) && ((j==0) || (j==1) || (j==10) || (j==11) || (j==12)) || ((i==1) || (i==7)) && ((j==0) || (j==1) || (j==8) || (j==9) || (j==10)) || ((i==2) || (i==6)) && ((j==0) || (j==1) || (j==6) || (j==7) || (j==8)) || ((i==3) || (i==5)) && ((j==0) || (j==1) || (j==4) || (j==5) || (j==6)) || ((i==4)) && ((j==0) || (j==1) || (j==2) || (j==3) || (j==4)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			    }
				System.out.println();
			}
			break;
			
		case 'd': 
			for(int i=0;i<=9;i++)
			{
				for(int j=0;j<=14;j++)
				{
				if(((i==0) || (i==8)) && ((j==0) || (j==1) || (j==2) || (j==3) || (j==4)|| (j==5) || (j==6) || (j==7) || (j==8) || (j==9) || (j==10)) || (((i==1) || (i==7)) && ((j==11) || (j==12) || (j==0) || (j==1))) || (((i==2) || (i==6)) && ((j==0) || (j==1) || (j==12) || (j==13))) || (((i==5) || (i==3) || (i==4)) && ((j==0) || (j==1) || (j==14) || (j==13))))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			    }
				System.out.println();
			}
			break;
	
		case 'w': 
					for(int i=0;i<9;i++)
					{
						for(int j=0;j<32;j++)
						{
						if(((i==0) && ((j==0) || (j==1) || (j==16) || (j==30) || (j==31))) || ((i==1) && ((j==1) || (j==2) || (j==15) || (j==16) || (j==17) || (j==29) || (j==30))) || ((i==2) && ((j==3) || (j==4) || (j==14) || (j==15) || (j==17) || (j==18) || (j==28) || (j==29))) || ((i==3) && ((j==4) || (j==5) || (j==13) || (j==14) || (j==18) || (j==19) || (j==27) || (j==28))) || ((i==4) && ((j==5) || (j==6) || (j==12) || (j==13) || (j==19) || (j==20) || (j==26) || (j==27))) || ((i==5) && ((j==6) || (j==7) || (j==11) || (j==12) || (j==20) || (j==21) || (j==25) || (j==26))) || ((i==6) && ((j==7) || (j==8) || (j==10) || (j==11) || (j==21) || (j==22) || (j==24) || (j==25))) || ((i==7) && ((j==8) || (j==9) || (j==10) || (j==22) || (j==23) || (j==23) || (j==24))) || ((i==8) && ((j==9) || (j==23))))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					    
						
					}
						System.out.println();
				
				
				
	}
	break;
		default: System.out.println("enter the name starting with k,d,w only");
		break;
				
}
		sc.close();
	}
	}
