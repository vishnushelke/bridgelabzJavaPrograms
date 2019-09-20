package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.inventoryModel1;

public class InventoryModel1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
		String inFile="/home/user/git/bridgelabzJavaPrograms/javaprograms/bootcamp/src/com/bridgelabz/json/inventorynew.json";
		String outFile="/home/user/git/bridgelabzJavaPrograms/javaprograms/bootcamp/src/com/bridgelabz/json/Inventoryout1.json";

		inventoryModel1 model=mapper.readValue(new File(inFile), inventoryModel1.class);
		System.out.println("Model  "+model);
		System.out.println("Grain name is :"+model.getGrain().get(0).getName());
	}

}
