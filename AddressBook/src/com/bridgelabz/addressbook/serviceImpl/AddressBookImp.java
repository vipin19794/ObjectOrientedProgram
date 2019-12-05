/*
 * Author   -   VIPIN SHARMA 
 * fileName -   AddressBookImp.java
 * Date     -   04/12/2019
 * 
 */

package com.bridgelabz.addressbook.serviceImpl;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.addressbook.Utility.Utility;
import com.bridgelabz.addressbook.model.Details;
import com.bridgelabz.addressbook.service.AddressBookService;

public class AddressBookImp implements AddressBookService
{
	JSONArray book;
	String filename;
	public Details details;
	
	
	public AddressBookImp()
	{
		details=new Details();
	}
/*****************************this CreateAddressbook method create the address Book file*******************************/	
	public void CreateAddressbook(String filename) throws Exception
	{
		FileWriter file=new FileWriter(filename+".json");
		file.write("[]");
		file.flush();
	}
/*****************************this ExsistingAddressbook method view the existing Address book*******************************/
	public void ExsistingAddressbook(String filename)throws Exception
	{
		this.filename=filename;
		try{
		String value=new JSONParser().parse(new FileReader(filename+".json")).toString();
		book=new JSONArray(value);
		}
		catch(Exception e)
		{
			System.out.println("no address book in that name");
		}
	}
	
/*****************************this GetDetails method get the data from File*******************************/		
	public void GetDetails(String name) throws Exception
	{
		JSONObject temp=new JSONObject();
		int count=0;
		for(int i=0;i<book.length();i++)
		{
			temp=book.getJSONObject(i);
			if(temp.get("firstname").equals(name))
			{
				count++;
				SetDetails(temp);
				break;
			}
		}
		if(count==0)System.out.println("No details for the name "+name);
		if(count==1)System.out.println(details);
	}
	
/*****************************this check method check the data from File*******************************/		
	public boolean check(String name) throws JSONException
	{
		JSONObject temp=new JSONObject();
		int count=0;
		for(int i=0;i<book.length();i++)
		{
			temp=book.getJSONObject(i);
			if(temp.get("firstname").equals(name))
			{
				return true;
			}
		}
		System.out.println("No details in that name");
		return true;
	}	

/*****************************this changingvalue method Update the data to File*******************************/	
	public void changingvalue(String name,String changer,String value) throws JSONException
	{
		JSONObject temp=new JSONObject();
		int count=0;
		for(int i=0;i<book.length();i++)
		{
			temp=book.getJSONObject(i);
			if(temp.get("firstname").equals(name))
			{
				temp.put(changer,value);
			}
		}
	}
	
/*****************************this changingvalue method Update the data to File*******************************/	
	public void changingvalue(String name,String changer,long value) throws JSONException
	{
		JSONObject temp=new JSONObject();
		int count=0;
		for(int i=0;i<book.length();i++)
		{
			temp=book.getJSONObject(i);
			if(temp.get("firstname").equals(name))
			{
				temp.put(changer,value);
			}
		}
	}
	
/*****************************this SetDetails method for Set data to File*******************************/	
	public void SetDetails(JSONObject person) throws Exception
	{
		details.setAddress(person.getString("address"));
		details.setCity(person.getString("city"));
		details.setFirstname(person.getString("firstname"));
		details.setLastname(person.getString("lastname"));
		details.setPhonenumber(person.getLong("phonenumber"));
		details.setState(person.getString("state"));
		details.setZip(person.getLong("zip"));
	}

/*****************************this add method for add the data to File*******************************/	
	public void add() throws Exception
	{
		JSONObject object=new JSONObject();
		System.out.println("Enter the first name");
		details.setFirstname(Utility.GetLine());
		object.put("firstname",details.getFirstname());
		System.out.println("Enter the last name");
		details.setLastname(Utility.GetLine());
		object.put("lastname",details.getLastname());
		System.out.println("Enter the address");
		details.setAddress(Utility.GetLine());
		object.put("address",details.getAddress());
		System.out.println("Enter the city");
		details.setCity(Utility.GetLine());
		object.put("city",details.getCity());
		System.out.println("Enter the phone number");
		details.setPhonenumber(Utility.Getlong());
		object.put("phonenumber",details.getPhonenumber());
		System.out.println("Enter the State");
		details.setState(Utility.GetLine());
		object.put("state",details.getState());
		System.out.println("Enter the Zipcode");
		details.setZip(Utility.Getlong());
		object.put("zip",details.getZip());
		book.put(object);		
	}
	
/*****************************this remove method for remove the data from file*******************************/		
	public void remove(String name) throws Exception
	{
		JSONObject object=new JSONObject();
		for(int i=0;i<book.length();i++)
		{
			object=book.getJSONObject(i);
			if(object.get("firstname").equals(name))
			{
				book.remove(i);
				break;
			}
		}
	}
	
/*****************************this save method for save data to the file*******************************/		
	public void save() throws Exception
	{
		  FileWriter file=new FileWriter(filename+".json");
		  file.write(book.toString());
		  file.flush();
		  file.close();
	}
	
/*****************************this Exit method for close the Address Book*******************************/	
	public void Exit()
	{
		System.out.print("Address book close----see you again");
		System.exit(0);
	}
	
}
