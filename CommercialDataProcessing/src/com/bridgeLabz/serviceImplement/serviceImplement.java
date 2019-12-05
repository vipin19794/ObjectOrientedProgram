/*
 * Author   -   VIPIN SHARMA 
 * fileName -   ServiceImplement.java
 * Date     -   03/12/2019
 */


package com.bridgeLabz.serviceImplement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
	Scanner sc = new Scanner(System.in);
	
/****************************this method for add the indivisual company details to stockData.json***************************************/	
	
	public void addCompanyDetails(Company mdl) throws IOException, ParseException
	{
		try 
		{   JSONObject obj1 = new JSONObject();
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
/****************************this method for remove the indivisual company details from stockData.json***************************************/			
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

/****************************this method for print the all company names from stockData.json***************************************/			
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

/****************************this method for print the indivisual company details from stockData.json***************************************/	

	@Override
	public void printStockReport(String companyName) throws FileNotFoundException, IOException, ParseException 
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

/****************************this method for add the indivisual user details to userData.json***************************************/	
	@Override
	public void addUserDetails(User mdl) throws FileNotFoundException, IOException, ParseException 
	{
		try 
		{   JSONObject obj1 = new JSONObject();
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

/****************************this method for remove the indivisual details from userData.json***************************************/	
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
/*********************************************this method for print indivisual person print report***********************/
	@Override
	public void printUserReport(String userName) throws FileNotFoundException, IOException, ParseException
	{
		// TODO Auto-generated method stub
		int num = 0;
		try 
		{
			
			//take data from userData.json file***********************
			JSONParser parser = new JSONParser();
			FileReader fr = new FileReader(userFilePath);
			Object obj = parser.parse(fr);
			JSONArray arr = new JSONArray(obj.toString());
			for(int i=0; i<arr.length(); i++)
			{
				JSONObject ob = arr.getJSONObject(i);
				if(ob.get("name").equals(userName))
				{
					System.out.println("user name : "+ob.get("name"));
					System.out.println("Total share : "+ob.get("share"));
					System.out.println("Total Price: "+ob.get("price"));
					break;
				}
				else
				{
					num++;
				}
			}
			if(num > 0)
			{
				System.out.println("user not in database...");
				System.out.println("please add the user name");
			}
            fr.close(); 
		
		} 
		catch (JSONException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
/**************************************this method for purchase share********************************************/
	@Override
	public void purchaseShare(String companyName,String userName, int share) throws FileNotFoundException, IOException, ParseException
	{
		// TODO Auto-generated method stub
		String comName ="";
		int    comShare = 0;
		int    comPrice = 0;
		
		String uName ="";
		int    uShare = 0;
		int    uPrice = 0;
		
	    try
	    {
	    	JSONParser parser = new JSONParser();
	    	
	    	// take value from stockData.json File....................
		    FileReader fr1 = new FileReader(companyFilePath);
		    Object obj1 = parser.parse(fr1);
			JSONArray arr1 = new JSONArray(obj1.toString());
			for(int i=0; i<arr1.length(); i++)
			{
				JSONObject object = arr1.getJSONObject(i);
				if(object.get("name").equals(companyName))
				{
					comName = object.getString("name");
					comShare = object.getInt("share");
					comPrice = object.getInt("price");
					arr1.remove(i);
					break;
				}
			}
			
			// take value from userData.json File....................
			FileReader fr2 = new FileReader(userFilePath);
		    Object obj2 = parser.parse(fr2);
			JSONArray arr2 = new JSONArray(obj2.toString());
			for(int i=0; i<arr2.length(); i++)
			{
				JSONObject object = arr2.getJSONObject(i);
				if(object.get("name").equals(userName))
				{
					uName = object.getString("name");
					uShare = object.getInt("share");
					uPrice = object.getInt("price");
					arr2.remove(i);
					break;
				}
			}
			
			// share purchase data proccessing logic................
			comShare = comShare-share;
			uShare = uShare+share;
			uPrice = comPrice*share;
			
			// add data to stockData.json File.................
			JSONObject obj3 = new JSONObject();
			obj3.put("name",comName);
			obj3.put("share",comShare);
			obj3.put("price",comPrice);
			
			arr1.put(obj3);
			FileWriter fw3= new FileWriter(companyFilePath);
			fw3.write(arr1.toString());
			fw3.flush();
			fw3.close();
			
			// add data to userkData.json File.................
			JSONObject obj4 = new JSONObject();
			obj4.put("name",uName);
			obj4.put("share",uShare);
			obj4.put("price",uPrice);
					
			arr2.put(obj4);
			FileWriter fw4= new FileWriter(userFilePath);
			fw4.write(arr2.toString());
			fw4.flush();
			fw4.close();
			
		}
	    catch (JSONException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
/**************************************this method for purchase share********************************************/
    @Override
    public void sellShare(String companyName, String userName, int share)throws FileNotFoundException, IOException, ParseException
   {
    	String comName ="";
		int    comShare = 0;
		int    comPrice = 0;
		
		String uName ="";
		int    uShare = 0;
		int    uPrice = 0;
		
	    try
	    {
	    	JSONParser parser = new JSONParser();
	    	
	    	// take value from stockData.json File....................
		    FileReader fr1 = new FileReader(companyFilePath);
		    Object obj1 = parser.parse(fr1);
			JSONArray arr1 = new JSONArray(obj1.toString());
			for(int i=0; i<arr1.length(); i++)
			{
				JSONObject object = arr1.getJSONObject(i);
				if(object.get("name").equals(companyName))
				{
					comName = object.getString("name");
					comShare = object.getInt("share");
					comPrice = object.getInt("price");
					arr1.remove(i);
					break;
				}
			}
			
			// take value from userData.json File....................
			FileReader fr2 = new FileReader(userFilePath);
		    Object obj2 = parser.parse(fr2);
			JSONArray arr2 = new JSONArray(obj2.toString());
			for(int i=0; i<arr2.length(); i++)
			{
				JSONObject object = arr2.getJSONObject(i);
				if(object.get("name").equals(userName))
				{
					uName = object.getString("name");
					uShare = object.getInt("share");
					uPrice = object.getInt("price");
					arr2.remove(i);
					break;
				}
			}
			
			// share purchase data proccessing logic................
			uShare = uShare-share;
			comShare = comShare+share;
			uPrice = uPrice-(comPrice*share);
			
			// add data to stockData.json File.................
			JSONObject obj3 = new JSONObject();
			obj3.put("name",comName);
			obj3.put("share",comShare);
			obj3.put("price",comPrice);
			
			arr1.put(obj3);
			FileWriter fw3= new FileWriter(companyFilePath);
			fw3.write(arr1.toString());
			fw3.flush();
			fw3.close();
			
			// add data to userkData.json File.................
			JSONObject obj4 = new JSONObject();
			obj4.put("name",uName);
			obj4.put("share",uShare);
			obj4.put("price",uPrice);
					
			arr2.put(obj4);
			FileWriter fw4= new FileWriter(userFilePath);
			fw4.write(arr2.toString());
			fw4.flush();
			fw4.close();
			
		}
	    catch (JSONException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
   }
	
}
