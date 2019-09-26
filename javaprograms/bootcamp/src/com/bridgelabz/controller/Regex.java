package com.bridgelabz.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.utility.Utility;

public class Regex {

	public static void main(String[] args) throws IOException {
		String message="Hello <<name>>,we have your full name as <<full name>> in our system.\n" + 
				"your contact number is 91xxxxxxxxxx.\n" + 
				"please let us know in case of any clarification\n" + 
				"Thank you.\n" + 
				"\nBridgeLabz\n" + 
				"01/01/2016";
	
		System.out.println("Enter name");
		String name=Utility.stringScan();
		String nameReplaced=Utility.replaceString(message, "<<name>>", name);
		System.out.println("Enter full name");
		String fullName=Utility.stringScan();
		String fullNameReplaced=Utility.replaceString(nameReplaced, "<<full name>>", fullName);
		System.out.println("Enter Mobile Number");
		long mobileNumber=Utility.longScan();
		String mobileN=String.valueOf(mobileNumber);
		String mobileNumberReplaced=Utility.replaceString(fullNameReplaced, "xxxxxxxxxx", mobileN);
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime date=LocalDateTime.now();
		String fianlMessage=Utility.replaceString(mobileNumberReplaced, "01/01/2016", dateTimeFormatter.format(date));
		System.out.println(fianlMessage);
	}

}
