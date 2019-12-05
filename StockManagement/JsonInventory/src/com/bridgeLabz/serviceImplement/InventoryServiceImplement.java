package com.bridgeLabz.serviceImplement;

import com.bridgeLabz.repository.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.InventoryList;
import com.bridgeLabz.service.*;

public class InventoryServiceImplement implements InventoryService
{

	@SuppressWarnings("unchecked")
	@Override
	public void writeDataToJsonFile(InventoryList il) throws IOException, ParseException 
	{
	    JSONObject obj1 = new JSONObject();
	    obj1.put("name", il.getName());
	  	obj1.put("weight", il.getWeight());
	    obj1.put("price", il.getPrice());
	    		
	    
	    
	    FileReader fr = new FileReader("src/com/bridgeLabz/repository/newFile.json");
	    JSONParser parser = new JSONParser();
	    Object obj = parser.parse(fr);
	    JSONArray arr2 = (JSONArray) obj;
	    arr2.add(obj1);
	    
	    
		try
		{
			
			@SuppressWarnings("resource")

			FileWriter fw = new FileWriter("src/com/bridgeLabz/repository/newFile.json");
			fw.write(arr2.toJSONString());
			fw.flush();
			fw.close();
		}
		catch(Exception e){System.out.println(e);}
		System.out.println("data store Successfully.........");
		
	}

	@Override
	public void readDataFromJsonFile() throws IOException, ParseException
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
         JSONParser parser = new JSONParser();
         try
         {
        	 
        	 FileReader fr = new FileReader("src/com/bridgeLabz/repository/newFile.json");
        	 Object object = parser.parse(fr);
        	 JSONArray jArray  = (JSONArray) object;
        	
        	 for(Object s : jArray )
        	 {
        		 System.out.println(s);
        		
        	 }
      	 }
         catch(Exception e)
         {
            e.printStackTrace();
         } 
	
	}
}
