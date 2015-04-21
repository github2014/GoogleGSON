package com.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import com.data.*;

public class WriteJSON {

	public static void main(String[] args) {
		//System.out.println("Vo");
		
		Country country = new Country();
		country.setName("Lithuania");
		country.setPopulation(3000000);
		
		List<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Vilnius");
		listOfStates.add("Kaunas");
		listOfStates.add("Klaipeda");
		
		country.setListOfStates(listOfStates);
		
		Gson gson = new Gson();
		
		// convert java object to JSON format
		// and return as JSON formatted string
		String json = gson.toJson(country);
		
		try {
			// write converted json data to a file named "CountryGSON.json"
			FileWriter writer = new FileWriter("C:\\Projects\\GoogleGSON\\CountryGSON.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(json);
	}

}
