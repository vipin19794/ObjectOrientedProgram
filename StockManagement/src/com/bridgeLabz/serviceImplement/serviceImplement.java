/*
 * Author   -   VIPIN SHARMA 
 * fileName -   ServiceImplement.java
 * Date     -   02/12/2019
 */

package com.bridgeLabz.serviceImplement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.Company;
import com.bridgeLabz.model.User;
import com.bridgeLabz.service.Service;

public class serviceImplement implements Service
{ 
	String companyFilePath = "src/com/bridgeLabz/repository/stockData.json";
	String userFilePath    = "src/com/bridgeLabz/repository/userData.json";
	
	public void addCompanyDetails(Company mdl) throws IOException, ParseException
	{
		JSONObject obj1 = new JSONObject();
		try 
		{
			obj1.put("name", mdl.getCompName());
			obj1.put("share", mdl.getCompShare());
			obj1.put("price", mdl.getSharePrice());
			
			
			JSONParser parser = new JSONParser();
			FileReader fr = new FileReader(companyFilePath);
			Object obj = parser.parse(fr);
			JSONArray arr = new JSONArray(obj.toString());
			arr.put(obj1);
			fr.close();
			
			FileWriter fw= new FileWriter(companyFilePath);
			fw.write(arr.toString());
			fw.flush();
			fw.close();
			
			System.out.println("data saved successfully......");
		} 
		catch (JSONException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
		
		@Override
	public void removeCompanyName(String companyName) throws FileNotFoundException, IOException, ParseException 
	{
			try 
			{
				
				
				JSONParser parser = new JSONParser();
				FileReader fr = new FileReader(companyFilePath);
				Object obj = parser.parse(fr);
				JSONArray arr = new JSONArray(obj.toString());
				for(int i=0; i<arr.length(); i++)
				{
					JSONObject ob = arr.getJSONObject(i);
					if(ob.get("name").equals(companyName))
					{
						arr.remove(i);
						break;
					}
				}
							
				FileWriter fw= new FileWriter(companyFilePath);
				fw.write(arr.toString());
				fw.flush();
				fw.close();
			
				
				System.out.println("data removed successfully......");
			} 
			catch (JSONException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

		@Override
	public void viewAllCompanyNames() throws FileNotFoundException, IOException, ParseException
	{
			try 
			{
				
				
				JSONParser parser = new JSONParser();
				FileReader fr = new FileReader(companyFilePath);
				Object obj = parser.parse(fr);
				JSONArray arr = new JSONArray(obj.toString());
				for(int i=0; i<arr.length(); i++)
				{
					JSONObject ob = arr.getJSONObject(i);
					System.out.println(ob.get("name"));
					
				}
			} 
			catch (JSONException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
	}

	@Override
	public void viewCompanyDetails(String companyName) throws FileNotFoundException, IOException, ParseException 
	{
		// TODO Auto-generated method stub
		try 
		{
			
			
			JSONParser parser = new JSONParser();
			FileReader fr = new FileReader(companyFilePath);
			Object obj = parser.parse(fr);
			JSONArray arr = new JSONArray(obj.toString());
			for(int i=0; i<arr.length(); i++)
			{
				JSONObject ob = arr.getJSONObject(i);
				if(ob.get("name").equals(companyName))
				{
					System.out.println("Company name : "+ob.get("name"));
					System.out.println("Total share of company : "+ob.get("share"));
					System.out.println("price of one share : "+ob.get("price"));
					break;
				}
			}
            fr.close(); 
		
		} 
		catch (JSONException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@Override
	public void addUserDetails(User mdl) throws FileNotFoundException, IOException, ParseException 
	{
		JSONObject obj1 = new JSONObject();
		try 
		{
			obj1.put("name", mdl.getUserName());
			obj1.put("share", mdl.getUserShare());
			obj1.put("price", mdl.getSharePrice());
			
			
			JSONParser parser = new JSONParser();
			FileReader fr = new FileReader(userFilePath);
			Object obj = parser.parse(fr);
			JSONArray arr = new JSONArray(obj.toString());
			arr.put(obj1);
			fr.close();
			
			FileWriter fw= new FileWriter(userFilePath);
			fw.write(arr.toString());
			fw.flush();
			fw.close();
			
			System.out.println("data saved successfully......");
		} 
		catch (JSONException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeUserName(String userName) throws FileNotFoundException, IOException, ParseException
	{
		try 
		{
			
			
			JSONParser parser = new JSONParser();
			FileReader fr = new FileReader(userFilePath);
			Object obj = parser.parse(fr);
			JSONArray arr = new JSONArray(obj.toString());
			for(int i=0; i<arr.length(); i++)
			{
				JSONObject ob = arr.getJSONObject(i);
				if(ob.get("name").equals(userName))
				{
					arr.remove(i);
					break;
				}
			}
						
			FileWriter fw= new FileWriter(userFilePath);
			fw.write(arr.toString());
			fw.flush();
			fw.close();
		
			
			System.out.println("data removed successfully......");
		} 
		catch (JSONException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
