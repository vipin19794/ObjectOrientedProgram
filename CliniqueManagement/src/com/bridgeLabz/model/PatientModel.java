/*
 * Author   -   VIPIN SHARMA 
 * fileName -   PatientModel.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.model;

public class PatientModel
{
	private int patientId;
    private String patientName;
    private String patientMobile;
    
    public PatientModel(int patientId, String patientName, String patientMobile)
    {
   	 this.patientId = patientId;
   	 this.patientName = patientName;
   	 this.patientMobile = patientMobile;
    }
    
    public int getPatientId()
    {
   	 return patientId;
    }
    
    public String getPatientName()
    {
   	 return patientName;
    }
    
    public String getPatientMobile()
    {
   	 return patientMobile;
    } 
	
}
