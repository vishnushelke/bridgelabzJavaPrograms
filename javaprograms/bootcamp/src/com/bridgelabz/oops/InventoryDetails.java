package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.inventoryModel;

public class InventoryDetails {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String inSource="/home/user/git/bridgelabzJavaPrograms/javaprograms/bootcamp/src/com/bridgelabz/json/inventry.json";
		String outSource="/home/user/git/bridgelabzJavaPrograms/javaprograms/bootcamp/src/com/bridgelabz/json/inventoryout.json";
		
		ObjectMapper mapper=new ObjectMapper();
		inventoryModel model=mapper.readValue(new File(inSource), inventoryModel.class);
		
		System.out.println("Model" +model);
		System.out.println("Grain name is :"+model.getGrains().get(0).getName());
		System.out.println("Grain weight is :"+model.getGrains().get(0).getWeight());
		System.out.println("Garin price is :"+model.getGrains().get(0).getPrice());
		System.out.println();

		System.out.println("Grain name is :"+model.getGrains().get(1).getName());
		System.out.println("Grain weight is :"+model.getGrains().get(1).getWeight());
		System.out.println("Garin price is :"+model.getGrains().get(1).getPrice());
		System.out.println();

		System.out.println("Grain name is :"+model.getGrains().get(2).getName());
		System.out.println("Grain weight is :"+model.getGrains().get(2).getWeight());
		System.out.println("Garin price is :"+model.getGrains().get(2).getPrice());
		System.out.println();
		mapper.writeValue(new File(outSource), model);
		
	}
}
