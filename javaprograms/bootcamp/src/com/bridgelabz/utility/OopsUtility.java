package com.bridgelabz.utility;

import com.bridgelabz.model.CustomerInfo;

public class OopsUtility {
	public static String[] sortCards(String[] player) {
		String temp = "";
		for (int j = 0; j < player.length; j++) {
			for (int j2 = j+1; j2 < player.length; j2++) {
				int len1 = player[j].length() - 1;
				int len2 = player[j2].length() - 1;
				int n1 = player[j].charAt(len1) + (player[j].charAt(len1 - 1)) * 10;
				int n2 = player[j2].charAt(len2) + (player[j2].charAt(len2 - 1)) * 10;
				if (n1 > n2) {
					temp = player[j];
					player[j] = player[j2];
					player[j2] = temp;
				}

			}
		}
		
		return player;
	}

	public static void showCards(String[][] player) {
		for (int j = 0; j < player.length; j++) {
			for (int j2 = 0; j2 < player[j].length; j2++) {
			player[j][j2] = player[j][j2].replaceAll("11", "jack");
			player[j][j2] = player[j][j2].replaceAll("12", "queen");
			player[j][j2] = player[j][j2].replaceAll("13", "king");
			player[j][j2] = player[j][j2].replaceAll("14", "ace");
			}
		}
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player[i].length; j++) {
				System.out.print(player[i][j] + ",");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static CustomerInfo createAccount()
	{
		CustomerInfo customer=new CustomerInfo();
		System.out.println("Enter your name");
		String name=Utility.stringScan();
		customer.setName(name);
		System.out.println("Enter your symbol,your name and ddmm of your date of birth");
		String symbol=Utility.stringScan();
		customer.setSymbol(symbol);
		System.out.println("How many shares you have?");
		int shares=Utility.intScan();
		customer.setAvailableshares(shares);
		System.out.println("how many ruppes you have for investment?");
		int ruppes=Utility.intScan();
		customer.setRupeesavailable(ruppes);
		return customer;
	}
	
	

}
