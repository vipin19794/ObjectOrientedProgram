/*
 * Author   -   VIPIN SHARMA 
 * fileName -   ServiceImplement.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.serviceImplement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.DoctorModel;
import com.bridgeLabz.model.PatientModel;
import com.bridgeLabz.service.Service;

public class ServiceImplement  implements Service
{
	  String doctorDataFilePath = "src/com/bridgeLabz/repository/doctorData.json";
	  String patientDataFilePath = "src/com/bridgeLabz/repository/patientData.json";
	  String appointmentDataFilePath = "src/com/bridgeLabz/repository/appointmentData.json";
	
      public void addDoctorDetails(DoctorModel dcrmdl) throws IOException, ParseException
      {
         try
          {
        	  JSONObject jsonObject = new JSONObject();
        	  jsonObject.put("id", dcrmdl.getDoctorId());
			  jsonObject.put("name", dcrmdl.getDoctorName());
			  jsonObject.put("specialist", dcrmdl.getDoctorSpecial());
			  jsonObject.put("time", dcrmdl.getDoctorTime());
			  
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(doctorDataFilePath);
			  Object obj = parser.parse(fr);
			  JSONArray arr = new JSONArray(obj.toString());
			  arr.put(jsonObject);
			  
			  FileWriter fw = new FileWriter(doctorDataFilePath);
			  fw.write(arr.toString());
			  fw.flush();
			  fw.close(); 
		  } 
          catch (JSONException e) 
          {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
      }

	@Override
	public void viewDoctorNames() throws IOException, ParseException
	{
		try
        {
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(doctorDataFilePath);
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
	public void removeDoctorDetails(int doctorId) throws IOException, ParseException
	{
		try
		{
		  JSONParser parser = new JSONParser();
		  FileReader fr = new FileReader(doctorDataFilePath);
		  Object obj = parser.parse(fr);
		  JSONArray arr = new JSONArray(obj.toString());
		  for(int i=0; i<arr.length(); i++)
	      {
	    	  JSONObject ob = arr.getJSONObject(i);
	    	  if(ob.getInt("id") == doctorId)
	    	  {
	    		  arr.remove(i);
	    		  break;
	    	  }
	    	  
	      }
		  
		  FileWriter fw = new FileWriter(doctorDataFilePath);
		  fw.write(arr.toString());
		  fw.flush();
		  fw.close();
		} 
		catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}

	@Override
	public void viewDoctorDetailes(String doctorName) throws IOException, ParseException 
	{

		try
        {
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(doctorDataFilePath);
			  Object obj = parser.parse(fr);
			  JSONArray arr = new JSONArray(obj.toString());
		      for(int i=0; i<arr.length(); i++)
		      {
		    	  JSONObject ob = arr.getJSONObject(i);
		    	  if(ob.get("name").equals(doctorName))
		    	  {
		    	     System.out.println("Doctor Id : "+ob.get("id"));
		    	     System.out.println("Doctor Name : "+ob.get("name"));
		    	     System.out.println("Doctor specialist : "+ob.get("specialist"));
		    	     System.out.println("Doctor time : "+ob.get("time"));
		    	  }   
		    	  
		      }
			  
		  } 
        catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		
	}

	@Override
	public void addPatientDetails(PatientModel ptnmdl) throws IOException, ParseException 
	{
		try
        {
      	  JSONObject jsonObject = new JSONObject();
      	  jsonObject.put("id",ptnmdl.getPatientId());
			  jsonObject.put("name",ptnmdl.getPatientName());
			  jsonObject.put("mobile",ptnmdl.getPatientMobile());
			  
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(patientDataFilePath);
			  Object obj = parser.parse(fr);
			  JSONArray arr = new JSONArray(obj.toString());
			  arr.put(jsonObject);
			  
			  FileWriter fw = new FileWriter(patientDataFilePath);
			  fw.write(arr.toString());
			  fw.flush();
			  fw.close(); 
		  } 
        catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void viewPatientNames() throws IOException, ParseException
    {
		try
        {
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(patientDataFilePath);
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
	public void viewPatientDetailes(String patientName) throws IOException, ParseException 
	{
		// TODO Auto-generated method stub
		try
        {
			  JSONParser parser = new JSONParser();
			  FileReader fr = new FileReader(patientDataFilePath);
			  Object obj = parser.parse(fr);
			  JSONArray arr = new JSONArray(obj.toString());
		      for(int i=0; i<arr.length(); i++)
		      {
		    	  JSONObject ob = arr.getJSONObject(i);
		    	  if(ob.get("name").equals(patientName))
		    	  {
		    	     System.out.println("Patient Id : "+ob.get("id"));
		    	     System.out.println("Patient Name : "+ob.get("name"));
		    	     System.out.println("Patient Number : "+ob.get("mobile"));
		    	  }   
		    	  
		      }
			  
		  } 
        catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		
	}

	@Override
	public void removePatientDetails(int patientId) throws IOException, ParseException 
	{
		try
		{
		  JSONParser parser = new JSONParser();
		  FileReader fr = new FileReader(patientDataFilePath);
		  Object obj = parser.parse(fr);
		  JSONArray arr = new JSONArray(obj.toString());
		  for(int i=0; i<arr.length(); i++)
	      {
	    	  JSONObject ob = arr.getJSONObject(i);
	    	  if(ob.getInt("id") == patientId)
	    	  {
	    		  arr.remove(i);
	    		  break;
	    	  }
	    	  
	      }
		  
		  FileWriter fw = new FileWriter(patientDataFilePath);
		  fw.write(arr.toString());
		  fw.flush();
		  fw.close();
		} 
		catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		
	}

	@Override
	public void patientAppointment(int tokenNumber, String specialization, int patientId) throws IOException, ParseException
	{
		String docName = "";
		String docTime = "";
		int patId = 0;
		String patName = "";
		String patMobile = "";
		try
        {
			JSONParser pa = new JSONParser();
			  FileReader fr = new FileReader(doctorDataFilePath);
			  Object obj = pa.parse(fr);
			  JSONArray arr = new JSONArray(obj.toString());
		      for(int i=0; i<arr.length(); i++)
		      {
		    	  JSONObject ob = arr.getJSONObject(i);
		    	  if(ob.get("specialist").equals(specialization))
		    	  {
		    	     docName = ob.getString("name");
		    	     docTime = ob.getString("time");
		    	  }   
		    	  
		      }
		      
		      JSONParser parser = new JSONParser();
			  FileReader f = new FileReader(patientDataFilePath);
			  Object obt = parser.parse(f);
			  JSONArray arr1 = new JSONArray(obt.toString());
		      for(int i=0; i<arr1.length(); i++)
		      {
		    	  JSONObject ob = arr1.getJSONObject(i);
		    	  if(ob.getInt("id") == patientId)
		    	  {
		    	     patId = ob.getInt("id");
		    	     patName = ob.getString("name");
		    	     patMobile = ob.getString("mobile");
		    	  }   
		    	  
		      }
		      
		      JSONObject jsonObject = new JSONObject();
        	  jsonObject.put("tokenNo",tokenNumber);
			  jsonObject.put("docName",docName);
			  jsonObject.put("docTime",docTime);
			  jsonObject.put("problem",specialization);
			  jsonObject.put("patId",patId);
			  jsonObject.put("patName",patName);
			  jsonObject.put("patMobile",patMobile);
			  
			  JSONParser parser2 = new JSONParser();
			  FileReader fr2 = new FileReader(appointmentDataFilePath);
			  Object obj2 = parser2.parse(fr2);
			  JSONArray arr2 = new JSONArray(obj2.toString());
			  arr2.put(jsonObject);
			  
			  FileWriter fw = new FileWriter(appointmentDataFilePath);
			  fw.write(arr2.toString());
			  fw.flush();
			  fw.close(); 
			  
		  } 
        catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}

	@Override
	public void printAppointmentPrescription(int patientId) throws IOException, ParseException
    {
		try
		{
			JSONParser parser = new JSONParser();
			  FileReader f = new FileReader(appointmentDataFilePath);
			  Object obt = parser.parse(f);
			  JSONArray arr1 = new JSONArray(obt.toString());
		      for(int i=0; i<arr1.length(); i++)
		      {
		    	  JSONObject ob = arr1.getJSONObject(i);
		    	  if(ob.getInt("patId") == patientId)
		    	  {
		    	     System.out.println("Token No.:"+ob.get("tokenNo"));
		    	     System.out.print("Dr.:"+ob.get("docName")+"   ");
		    	     System.out.print("Timing:"+ob.get("docTime")+"   ");
		    	     System.out.println("Sepecialist:"+ob.get("problem"));
		    	     System.out.print("Patient Id:"+ob.get("patId")+"   ");
		    	     System.out.print("Patient Name:"+ob.get("patName")+"   ");
		    	     System.out.print("Patient No:"+ob.get("patMobile"));
		    	     
		    	  }   
		    	  
		      }
		}
		
		catch (JSONException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		
	}	
}


