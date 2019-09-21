package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;

public class Inventory {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper =new ObjectMapper();
		InventoryModel data=new InventoryModel();
		String inSource="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/inventory.json";
		String outSource="/home/user/Desktop/vishnu/bridgelabzJavaPrograms/javaprograms/bootcamp/Files/json files/inventoryOut.json";
		
		data=mapper.readValue(new File(inSource), InventoryModel.class);
		
		//printing values
		System.out.println("first rice is :"+data.getRice().get(0).getName());
		System.out.println("weight of rice is :"+data.getRice().get(0).getWeight());
		System.out.println("Price of rice is :"+data.getRice().get(0).getPrice());
		System.out.println("Total value is :"+(data.getRice().get(0).getWeight()*data.getRice().get(0).getPrice()));
		System.out.println();
		
		System.out.println("Second rice is "+data.getRice().get(1).getName());
		System.out.println("weight of rice is :"+data.getRice().get(1).getWeight());
		System.out.println("Price of rice is :"+data.getRice().get(1).getPrice());
		System.out.println("Total value is :"+(data.getRice().get(1).getWeight()*data.getRice().get(1).getPrice()));
		System.out.println();
		
		System.out.println("third rice is :"+data.getRice().get(2).getName());
		System.out.println("weight of rice is :"+data.getRice().get(2).getWeight());
		System.out.println("Price of rice is :"+data.getRice().get(2).getPrice());
		System.out.println("Total value is :"+(data.getRice().get(2).getWeight()*data.getRice().get(2).getPrice()));
		System.out.println();
		
		System.out.println("first wheat is :"+data.getWheat().get(0).getName());
		System.out.println("weight of wheat is :"+data.getWheat().get(0).getWeight());
		System.out.println("Price of wheat is :"+data.getWheat().get(0).getPrice());
		System.out.println("Total value is :"+(data.getWheat().get(0).getWeight()*data.getWheat().get(0).getPrice()));
		System.out.println();
		
		System.out.println("Second wheat is :"+data.getWheat().get(1).getName());
		System.out.println("weight of wheat is :"+data.getWheat().get(1).getWeight());
		System.out.println("Price of wheat is :"+data.getWheat().get(1).getPrice());
		System.out.println("Total value is :"+(data.getWheat().get(1).getWeight()*data.getWheat().get(1).getPrice()));
		System.out.println();
		
		System.out.println("third wheat is :"+data.getWheat().get(2).getName());
		System.out.println("weight of wheat is :"+data.getWheat().get(2).getWeight());
		System.out.println("Price of wheat is :"+data.getWheat().get(2).getPrice());
		System.out.println("Total value is :"+(data.getWheat().get(2).getWeight()*data.getWheat().get(2).getPrice()));
		System.out.println();
		
		System.out.println("first pulse is :"+data.getPulses().get(0).getName());
		System.out.println("weight of pulse is :"+data.getPulses().get(0).getWeight());
		System.out.println("Price of pulse is :"+data.getPulses().get(0).getPrice());
		System.out.println("Total value is :"+(data.getPulses().get(0).getWeight()*data.getPulses().get(0).getPrice()));
		System.out.println();
		
		System.out.println("Second pulse is :"+data.getPulses().get(1).getName());
		System.out.println("weight of pulse is :"+data.getPulses().get(1).getWeight());
		System.out.println("Price of pulse is :"+data.getPulses().get(1).getPrice());
		System.out.println("Total value is :"+(data.getPulses().get(1).getWeight()*data.getPulses().get(1).getPrice()));
		System.out.println();
		
		System.out.println("third pulse is :"+data.getPulses().get(2).getName());
		System.out.println("weight of pulse is :"+data.getPulses().get(2).getWeight());
		System.out.println("Price of pulse is :"+data.getPulses().get(2).getPrice());
		System.out.println("Total value is :"+(data.getPulses().get(2).getWeight()*data.getPulses().get(2).getPrice()));
		System.out.println();
		
		mapper.writeValue(new File(outSource), data);
	}

}
