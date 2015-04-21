package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;

import com.data.*;

public class ReadJSON {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		try {
			System.out.println("Reading JSON from a file");
			System.out.println("-------------------------");
			
			BufferedReader bufferReader = new BufferedReader(new FileReader("C:\\Projects\\GoogleGSON\\countryGSON.json"));
			
			Country country = gson.fromJson(bufferReader, Country.class);
			
			System.out.println("Name of Country: " + country.getName());
			System.out.println("Population of Country: " + country.getPopulation());
			System.out.println("Startes are: ");
			List<String> listOfStates = country.getListOfStates();
			
			for(int i = 0; i < listOfStates.size(); i++) {
				System.out.println(listOfStates.get(i));
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
