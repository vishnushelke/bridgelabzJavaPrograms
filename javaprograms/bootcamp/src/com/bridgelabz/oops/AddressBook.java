package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.AdressbookModel;
import com.bridgelabz.model.Karnataka;
import com.bridgelabz.model.Kerala;
import com.bridgelabz.model.Maharashtra;

public class AddressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String inFile="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/addressbookIn.json";
		
		AdressbookModel model=new AdressbookModel();
		model=mapper.readValue(new File(inFile),AdressbookModel.class);
		ArrayList<Maharashtra> mahashtraList=new ArrayList<>();
		ArrayList<Karnataka> karnatakaList=new ArrayList<>();
		ArrayList<Kerala> keralaList=new ArrayList<>();
		
		System.out.println("first contact is:");
//		System.out.println(model.getState().get(0).getMaharashtra().get(0).getFirstName());
		
		
	}

}
