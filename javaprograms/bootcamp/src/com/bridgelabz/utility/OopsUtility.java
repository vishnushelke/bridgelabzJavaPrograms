package com.bridgelabz.utility;

public class OopsUtility {
	public static String[] sortCards(String[] player) {
		String temp = "";
		for (int j = 0; j < player.length; j++) {
			for (int j2 = 0; j2 < player.length; j2++) {
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
		for (int j = 0; j < player.length; j++) {
			for (int j2 = 0; j2 < player.length; j2++) {
				player[j].replaceAll("11", "jack");
				player[j].replaceAll("12", "queen");
				player[j].replaceAll("13", "king");
				player[j].replaceAll("14", "ace");
				player[j2].replaceAll("11", "jack");
				player[j2].replaceAll("12", "queen");
				player[j2].replaceAll("13", "king");
				player[j2].replaceAll("14", "ace");
			}
		}
		return player;
	}

	public static void showCards(String[] player) {
		for (int i = 0; i < player.length; i++) {
			System.out.print(player[i] + ",");
		}
	}

}
