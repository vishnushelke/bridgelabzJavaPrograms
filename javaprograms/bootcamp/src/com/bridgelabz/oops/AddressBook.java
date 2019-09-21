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
import com.bridgelabz.model.State;
import com.bridgelabz.utility.Utility;

public class AddressBook {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String inFile = "/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/addressbookIn.json";

		AdressbookModel model = new AdressbookModel();

		// added states in Arraylist
		model = mapper.readValue(new File(inFile), AdressbookModel.class);
		ArrayList<AdressbookModel> adressbookModels = new ArrayList<AdressbookModel>();
		System.out.println(model.getState().get(0).getStatename());

		ArrayList<State> stateList = new ArrayList<State>();
		stateList.addAll(model.getState());
		ArrayList<Maharashtra> mahashtraList = new ArrayList<>();
		mahashtraList.addAll(model.getState().get(0).getMaharashtra());
		ArrayList<Karnataka> karnatakaList = new ArrayList<>();
		karnatakaList.addAll(model.getState().get(1).getKarnataka());
		ArrayList<Kerala> keralaList = new ArrayList<>();
		keralaList.addAll(model.getState().get(2).getKerala());

		// System.out.println("first contact is:");
//		System.out.println(model.getState().get(0).getMaharashtra().get(0).getFirstName());

		System.out.println(
				"what do you want to do?\n1.Open a state Directory\n2.create a new state Directory\n3.save updated Address Book\n4.save updated Address book as\n5.Quit");
		int response = Utility.intScan();
		//System.out.println(stateList.get(0).get);
		switch (response) {
		case 1:
			System.out.println("welcome Sir!!");
			System.out.println("Which state directory you want to open?");
			for (int i = 0; i < stateList.size(); i++) {
				System.out.println((i+1)+". "+model.getState().get(i).getStatename());
			}
			int stateResponse = Utility.intScan();
			boolean exit = false;
			while (!exit) {
				switch (stateResponse) {
				case 1:
					System.out.println("Welcome to Maharastra State AddressBook");
					System.out.println(
							"what do you want to do?\n1.add a person to AddressBook\n2.Edit Info of a person\n3.Delete a person\n4.sort AddressBook by lastName\n5.sort AddressBook by zipCode\n6.Print entries\n7.exit");
					int response1 = Utility.intScan();
					switch (response1) {
					case 1:
						Maharashtra maharashtra = new Maharashtra();
						System.out.println("Enter the name");
						String firstName = Utility.stringScan();
						maharashtra.setFirstName(firstName);
						System.out.println("Enter Last Name");
						String lastName = Utility.stringScan();
						maharashtra.setLastName(lastName);
						System.out.println("Enter Address");
						String address = Utility.stringScan();
						maharashtra.setAddress(address);
						System.out.println("Enter the city");
						String city = Utility.stringScan();
						maharashtra.setCity(city);
						System.out.println("Enter the state");
						String state = Utility.stringScan();
						maharashtra.setState(state);
						System.out.println("Enter your zip code");
						String zip = Utility.stringScan();
						maharashtra.setZip(zip);
						String phoneNumber = Utility.stringScan();
						System.out.println("Enter your phone Number");
						maharashtra.setPhoneNumber(phoneNumber);
						mahashtraList.add(maharashtra);
						System.out.println("Person added Successfully");
						System.out.println("do you want to exit?n\1.yes\n2.no");
						int exitResponse = Utility.intScan();
						if (exitResponse == 1) {
							exit = true;
							System.out.println("Exit!");
						}

						break;
					case 2:
					}

				}
			}

		}

	}

}
