/*
 * Author   -   VIPIN SHARMA 
 * fileName -   DoctorModel.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.model;

public class DoctorModel
{
	 private int doctorId;
     private String doctorName;
     private String doctorSpecial;
     private String doctorTime;
     
     public DoctorModel(int doctorId, String doctorName, String doctorSpecial, String doctorTime)
     {
    	 this.doctorId = doctorId;
    	 this.doctorName = doctorName;
    	 this.doctorSpecial = doctorSpecial;
    	 this.doctorTime = doctorTime;
     }
     
     public int getDoctorId()
     {
    	 return doctorId;
     }
     
     public String getDoctorName()
     {
    	 return doctorName;
     }
     
     public String getDoctorSpecial()
     {
    	 return doctorSpecial;
     }
     
     public String getDoctorTime()
     {
    	 return doctorTime;
     }
}
