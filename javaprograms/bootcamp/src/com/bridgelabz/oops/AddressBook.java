package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.AddresBookModel;
import com.bridgelabz.model.Person;
import com.bridgelabz.model.State;
import com.bridgelabz.utility.Utility;

public class AddressBook {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddresBookModel model=new AddresBookModel();
		ObjectMapper mapper=new ObjectMapper();
		String fileOut="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/addressbook.json";
		 ArrayList<Person> persons=new ArrayList<Person>();
		 ArrayList<Person> persons1=new ArrayList<Person>();
		 ArrayList<State> states= new ArrayList<State>();
		 State addressbook=new State();
		 
		 System.out.println("Welcome to address Book sir!");
		 System.out.println("What do you want to do?\n1.create a new addressbook\n2.open an addressbook");
		 int response=Utility.intScan();
		 switch(response)
		 {
		 case 1:System.out.println("give a state name,kindly insert full name and in lowercase only");
				String state1=Utility.stringScan();
				boolean isFound=false;
				
				//searching in addressbook if the state is already available
				for (int i = 0; i < states.size(); i++) {
					String statesearch=model.getState().get(i).getStatename();
					if(state1.equals(statesearch))
					{
						isFound=true;
						System.out.println("This addressbook is already available,\nkindlyopen that addressbook");
						break;
					}
					
				}
				break;
				
				
		 case 2://opening addressbook
			 int addressbookPosition=0;
			 System.out.println("give a state name,kindly insert full name and in lowercase only");
				String statename=Utility.stringScan();
				isFound=false;
				//searching in addressbook if the state is already available
				for (int i = 0; i < states.size(); i++) {
					String statesearch=model.getState().get(i).getStatename();
					if(statename.equals(statesearch))
					{
						isFound=true;
						System.out.println("This addressbook is already available,\nkindlyopen that addressbook");
						break;
					}
				}
				if(!isFound)
				{
					State statenew=new State();
					statenew.setStatename(state1);
					System.out.println("Enter a firstname of the person");
					String firstname=Utility.stringScan();
					Person person=new Person();
					person.setFirstname(firstname);
					 System.out.println("Enter the last name");
					 String lastname="shelke";
					 person.setLastname(lastname);
					 System.out.println("Enter the address");
					 String address="radha krishna nagar";
					 person.setAddress(address);
					 System.out.println("Enter the city");
					 String city="Latur";
					 person.setCity(city);
					 System.out.println("Enter the state");
					statename="maharshtra";
					 person.setState(statename);
					 System.out.println("Enter the zip code");
					 int zip=413512;
					 person.setZip(zip);
					 System.out.println("Enter mobile Number");
					 String mobile="8180927857";
					 person.setPhone(mobile);
					 persons.add(person);
					 System.out.println("Person added successfully in your new addressbook");
					 statenew.setPerson(persons);
					 states.add(statenew);	 
				}
		 }
		 
		 //inserting person in address book
		 Person person=new Person();
		 System.out.println("Enter the first name");
		 String firstname="vishnu";
		 person.setFirstname(firstname);
		 System.out.println("Enter the last name");
		 String lastname="shelke";
		 person.setLastname(lastname);
		 System.out.println("Enter the address");
		 String address="radha krishna nagar";
		 person.setAddress(address);
		 System.out.println("Enter the city");
		 String city="Latur";
		 person.setCity(city);
		 System.out.println("Enter the state");
		 String statename="maharshtra";
		 person.setState(statename);
		 System.out.println("Enter the zip code");
		 int zip=413512;
		 person.setZip(zip);
		 System.out.println("Enter mobile Number");
		 String mobile="8180927857";
		 person.setPhone(mobile);
		 persons.add(person);
		 
		
		 addressbook.setStatename(statename);
		 addressbook.setPerson(persons);
		states.add(addressbook);
		model.setState(states);
		
		//adding addressbook
		System.out.println("give a state name");
		String state1=Utility.stringScan();
		State state2=new State();
		state2.setStatename(state1);
		Person person1=new Person();
		 System.out.println("Enter the first name");
		 String firstname1="mahesh";
		 person1.setFirstname(firstname1);
		 System.out.println("Enter the last name");
		 String lastname1="shelke";
		 person1.setLastname(lastname1);
		 System.out.println("Enter the address");
		 String address1="radha krishs nagar";
		 person1.setAddress(address1);
		 System.out.println("Enter the city");
		 String city1="gulbarga";
		 person1.setCity(city1);
		 System.out.println("Enter the state");
		 String statename1="karnataka";
		 person1.setState(statename1);
		 System.out.println("Enter the zip code");
		 int zip1=510245;
		 person1.setZip(zip1);
		 System.out.println("Enter mobile Number");
		 String mobile1="9449864372";
		 person1.setPhone(mobile1);
		 persons1.add(person1);
		 state2.setPerson(persons1);
		 state2.setStatename(state1);
		 states.add(state2);
		 model.setState(states);
		
		mapper.writeValue(new File(fileOut), model);
	}
}
