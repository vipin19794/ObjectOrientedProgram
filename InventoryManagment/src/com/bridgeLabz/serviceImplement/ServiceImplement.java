/*
 * Author   -   VIPIN SHARMA 
 * fileName -   ServiceImplement.java
 * Date     -   29/11/2019
 */

package com.bridgeLabz.serviceImplement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeLabz.model.Model;
import com.bridgeLabz.service.Service;

public class ServiceImplement implements Service
{

	public void add(Model il) 
	{
		try
		{
	    JSONObject obj1=new JSONObject();
	    obj1.put("name", il.getName());
	  	obj1.put("weight", il.getWeight());
	    obj1.put("price",il.getPrice());
	    
	    
	    FileReader fr = new FileReader("src/com/bridgeLabz/repository/newFile.json");
	    JSONParser parser = new JSONParser();
	    Object obj = parser.parse(fr);
	    JSONArray arr2 =new JSONArray(obj.toString());
	    arr2.put(obj1);
	    
	    
		try
		{

			FileWriter fw = new FileWriter("src/com/bridgeLabz/repository/newFile.json");
			fw.write(arr2.toString());
			fw.flush();
			fw.close();
			System.out.println("data store Successfully.........");
		}
		catch(Exception e){System.out.println(e);}
		}
		catch(Exception e)
		{e.printStackTrace();}
		
	}

	public void grainList() throws IOException
	{
         JSONParser parser = new JSONParser();
         try
         {
        	 
        	 FileReader fr = new FileReader("D:\\eclips\\InventoryManagment\\src\\com\\bridgeLabz\\repository\\newFile.json");
        	 Object object = parser.parse(fr);
        	 JSONArray jArray  =new JSONArray(object.toString());
        	 //        		 System.out.println(jArray);
        	 for(int i=0; i<jArray.length(); i++)
        	 {
        		JSONObject ob = jArray.getJSONObject(i);
		    	
		    		 System.out.print("name:"+ob.get("name")+" ");
		    		 System.out.print("weight:"+ob.get("weight")+" ");
		    		 System.out.print("price:"+ob.get("price")+" ");
		    		 System.out.println();
        	 }
      	 }
         catch(Exception e)
         {
            e.printStackTrace();
         } 
	
	}

	public void price(String s) 
    {
		String name ="";
		double total;
		double price=0;
		double weight=0;
		try
		{
		JSONParser parser = new JSONParser();
		
			FileReader fr = new FileReader("D:\\eclips\\InventoryManagment\\src\\com\\bridgeLabz\\repository\\newFile.json");
		    Object object = parser.parse(fr);
		    JSONArray jsonArray =new JSONArray(object.toString());
		    for(int i=0; i<jsonArray.length(); i++)
		    {
		    	JSONObject ob=jsonArray.getJSONObject(i);
		    	 if(ob.get("name").equals(s))
		    	 {
		    		 name = (String) ob.get("name");
		    		 weight = ob.getDouble("weight");
		    		 price =  ob.getDouble("price");
		    	}
		    }
		    total = weight*price;
		    System.out.println("total price of"+name+" = "+total);
		    
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void remove(String s) 
    {
		try
		{
		JSONParser parser = new JSONParser();
		
			FileReader fr = new FileReader("D:\\eclips\\InventoryManagment\\src\\com\\bridgeLabz\\repository\\newFile.json");
		    Object object = parser.parse(fr);
		    JSONArray jsonArray =new JSONArray(object.toString());
		    for(int i=0; i<jsonArray.length(); i++)
		    {
		    	JSONObject ob=jsonArray.getJSONObject(i);
		    	 if(ob.get("name").equals(s))
		    	 {
		    		 System.out.println("");
		    		 jsonArray.remove(i);
		    		 break;
		    	}
		    }
		    
		    FileWriter fw = new FileWriter("D:\\eclips\\InventoryManagment\\src\\com\\bridgeLabz\\repository\\newFile.json");
			fw.write(jsonArray.toString());
			fw.flush();
			fw.close();
			System.out.println("data remove Successfully.........");
		    
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	
	}
}
