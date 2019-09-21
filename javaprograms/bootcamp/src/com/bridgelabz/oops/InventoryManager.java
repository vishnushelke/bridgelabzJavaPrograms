package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;
import com.bridgelabz.model.Pulse;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheat;
import com.bridgelabz.utility.Utility;

public class InventoryManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InventoryModel data=new InventoryModel();
		ObjectMapper mapper=new ObjectMapper();
		String oldFile="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/inventory.json";
		String newFile="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/newInventoryByManager.json";
		
		data=mapper.readValue(new File(oldFile), InventoryModel.class);
		ArrayList<Rice> riceList = new ArrayList<Rice>();
		riceList.addAll(data.getRice());
		ArrayList<Wheat> wheatList = new ArrayList<Wheat>() ;
		wheatList.addAll(data.getWheat());
		ArrayList<Pulse> pulsesList = new ArrayList<Pulse>();
		pulsesList.addAll(data.getPulses());
		//Inventory.main(args);
		
		System.out.println("Welcome to an Inventory Factory Sir!");
		System.out.println("How many inventory you want to create");
		int inventoryNumber = Utility.intScan();
		while(inventoryNumber>0)
		{
			System.out.println("which inventory you want to add?\n1.rice\n2.wheat\n3.pulse");
			int grainName=Utility.intScan();
			switch(grainName)
			{
			case 1:Rice rice=new Rice();
					System.out.println("Enter the rice name");
					String name=Utility.stringScan();
					rice.setName(name);
					System.out.println("Enter the weight");
					int weight=Utility.intScan();
					rice.setWeight(weight);
					System.out.println("Enter the price");
					int price=Utility.intScan();
					rice.setPrice(price);
					int totalValue=weight*price;
					rice.setTotalValue(totalValue);
					
					riceList.add(rice);
					break;
					
			case 2:Wheat wheat=new Wheat();
					System.out.println("Enter the wheat name");
					name=Utility.stringScan();
					wheat.setName(name);
					System.out.println("Enter the weight");
					weight=Utility.intScan();
					wheat.setWeight(weight);
					System.out.println("Enter the price");
					price=Utility.intScan();
					wheat.setPrice(price);
					totalValue=weight*price;
					wheat.setTotalValue(totalValue);
					
					wheatList.add(wheat);
					break;
					
			case 3:Pulse pulses=new Pulse();
					System.out.println("Enter the wheat name");
					name=Utility.stringScan();
					pulses.setName(name);
					System.out.println("Enter the weight");
					weight=Utility.intScan();
					pulses.setWeight(weight);
					System.out.println("Enter the price");
					price=Utility.intScan();
					pulses.setPrice(price);
					totalValue=weight*price;
					pulses.setTotalValue(totalValue);
					
					pulsesList.add(pulses);
					break;
					
					default:System.out.println("Enter the valid input");break;
			}
			inventoryNumber--;
		}
		
		data.setRice(riceList);
		data.setPulses(pulsesList);
		data.setWheat(wheatList);
		
		mapper.writeValue(new File(newFile), data);
		System.out.println("Inventories you given added sir");
	}

}
