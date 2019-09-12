package com.bridgelabz.functional;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class P14TicToeGame {
	
	public static boolean isWin(char[][] a)
	{
		boolean[] b= {false,false,false};
		if((a[0][0]=='0' && a[0][1]=='0' && a[0][2]=='0') ||
				(a[1][0]=='0' && a[1][1]=='0' && a[1][2]=='0') ||
				(a[2][0]=='0' && a[2][1]=='0' && a[2][2]=='0') ||
				(a[0][0]=='0' && a[1][1]=='0' && a[2][2]=='0') ||
				(a[0][2]=='0' && a[1][1]=='0' && a[2][0]=='0') ||
				(a[0][0]=='0' && a[1][0]=='0' && a[2][0]=='0') ||
				(a[0][1]=='0' && a[1][1]=='0' && a[2][1]=='0') ||
				(a[0][2]=='0' && a[1][2]=='0' && a[2][2]=='0'))
		{
			return true;
		}
		else if((a[0][0]=='X' && a[0][1]=='X' && a[0][2]=='X') ||
				(a[1][0]=='X' && a[1][1]=='X' && a[1][2]=='X') ||
				(a[2][0]=='X' && a[2][1]=='X' && a[2][2]=='X') ||
				(a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X') ||
				(a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X') ||
				(a[0][0]=='X' && a[1][0]=='X' && a[2][0]=='X') ||
				(a[0][1]=='X' && a[1][1]=='X' && a[2][1]=='X') ||
				(a[0][2]=='X' && a[1][2]=='X' && a[2][2]=='X'))
		{
			return true;
		}
		return false;
	}
	
	public static void show(char [][] a)
	{
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		//Predefining a veriable for Deciding the player
		int player=0,move=0,de=0,win=0;
		char move1='\u0000';
		
		//creating board
		char[][] a= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		
		//deciding who will go first
		double x=Math.random();
		if(x>0.5)
		{
			System.out.println("System Will play first move");
			//deciding place to place first move
			switch(rand.nextInt(5))
			{
			case 0: a[0][0]='X';break;
			case 1: a[0][2]='X';break;
			case 2: a[2][0]='X';break;
			case 3: a[2][2]='X';break;
			case 4: a[1][1]='X';break;
			default :System.out.println("invalid");break;
			}
			show(a);
			player++;
		}
		else {
			System.out.println("User will play first move");
			System.out.println("Take your move");
			move=sc.nextInt();
			//placing user move
			switch(move)
			{
			case 1: a[0][0]='0';break;
			case 2: a[0][1]='0';break;
			case 3: a[0][2]='0';break;
			case 4: a[1][0]='0';break;
			case 5: a[1][1]='0';break;
			case 6: a[1][2]='0';break;
			case 7: a[2][0]='0';break;
			case 8: a[2][1]='0';break;
			case 9: a[2][2]='0';break;
			default:System.out.println("not valid move");break;
			}
			show(a);
		}
		
		//taking a counter
		int count=1;
		while(count<9 && win==0)
		{
			//Deciding the player
			//if player%2=0,system will play and if player%2=1,user will play
			
			switch(player%2)
			{
			case 0:System.out.println("its system turn");
					System.out.println("System Will take move");
					de=0;
					move=rand.nextInt(9)+1;
					move1=String.valueOf(move).charAt(0);
					
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if(a[i][j]==move1)
								{
									de=1;
									break;
								}
						}
					}
					
					while(de==0)
					{
						move=rand.nextInt(9)+1;
						move1=String.valueOf(move).charAt(0);
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								if(a[i][j]==move1)
									{
										de=1;
										break;
									}
							}
						}
						
					}
					
					
					//deciding place to place first move
					switch(move)
					{
					case 1: a[0][0]='X';break;
					case 2: a[0][1]='X';break;
					case 3: a[0][2]='X';break;
					case 4: a[1][0]='X';break;
					case 5: a[1][1]='X';break;
					case 6: a[1][2]='X';break;
					case 7: a[2][0]='X';break;
					case 8: a[2][1]='X';break;
					case 9: a[2][2]='X';break;
					default:System.out.println("not valid move");break;
					}
					show(a);
					if(isWin(a))
					{
						System.out.println("System Won!Better Luck Next Time!");
						win=1;
						break;
					}
					player++;
					System.out.println(count);
					count++;
					break;
			case 1:System.out.println("Its users turn,take your move");
					move=sc.nextInt();
					move1=String.valueOf(move).charAt(0);
					de=0;
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if(a[i][j]==move1)
								{
									de=1;
									break;
								}
						}
					}
					while(de==0)
					{
						System.out.println("Place is not vacant,take another move");
						move=sc.nextInt();
						move1=String.valueOf(move).charAt(0);
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								if(a[i][j]==move1)
									{
										de=1;
										break;
									}
							}
						}
						
					}
					switch(move)
					{
					case 1: a[0][0]='0';break;
					case 2: a[0][1]='0';break;
					case 3: a[0][2]='0';break;
					case 4: a[1][0]='0';break;
					case 5: a[1][1]='0';break;
					case 6: a[1][2]='0';break;
					case 7: a[2][0]='0';break;
					case 8: a[2][1]='0';break;
					case 9: a[2][2]='0';break;
					default:System.out.println("not valid move");break;
					}
					show(a);
					if(isWin(a))
					{
						System.out.println("Congratulations!You Won!!");
						win=1;
						break;
					}
					player++;
					System.out.println(count);
					count++;
					break;
			}
		}
		
		if(win==0)
		{
			System.out.println("Game is Drawn!Well Played Both!");
		}
	}
}
