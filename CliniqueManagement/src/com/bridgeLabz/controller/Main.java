/*
 * Author   -   VIPIN SHARMA 
 * Version  -   3.7
 * Purpose  -   Create CliniqueManagement Project (----Add Docter Detailes, View Docter Names, View Docter Detailes, remove Docter Detailes, 
 *              Add Patient Detailes, View Patient Names, View Patient Detailes, remove Patient Detailes, 
 *              Dr. appointment, Print appointment prescription----).
 * fileName -   Main.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.controller;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.DoctorModel;
import com.bridgeLabz.model.PatientModel;
import com.bridgeLabz.serviceImplement.ServiceImplement;

public class Main 
{
   public static void main(String args[]) throws IOException, ParseException
   {
	   Scanner sc = new Scanner(System.in);
	   ServiceImplement si = new ServiceImplement ();
	 
	   System.out.println("press 1 Add Docter Detailes");
	   System.out.println("press 2 View Docter Names");
	   System.out.println("press 3 View Docter Detailes");
	   System.out.println("press 4 remove Docter Detailes");
	   System.out.println("press 5 Add Patient Detailes");
	   System.out.println("press 6 View Patient Names");
	   System.out.println("press 7 View Patient Detailes");
	   System.out.println("press 8 remove Patient Detailes");
	   System.out.println("press 9 Dr. appointment");
	   System.out.println("press 10 Print appointment prescription");
	   
	   
	   int n = sc.nextInt();
	   
	   if(n == 1)
       {
		   System.out.println("Enter the Doctor ID");
		   int doctorId = sc.nextInt();
		   System.out.println("Enter the Doctor Name");
		   String doctorName = sc.next();
		   System.out.println("Enter the Doctor specialization");
		   String doctorSpecial = sc.next();
		   System.out.println("Enter the Doctor Timing");
		   String doctorTime = sc.next();
		   
		   DoctorModel dcrmdl = new DoctorModel(doctorId,doctorName,doctorSpecial,doctorTime);
		   si.addDoctorDetails(dcrmdl);
		   System.out.println("Details add Successfully.....");
       
       }    
	   
	   if(n == 2)
       {
		   si.viewDoctorNames();
       } 
	   
	   if(n == 3)
       {
		   System.out.println("Enter the Doctor Name");
		   String doctorName = sc.next();
		   si.viewDoctorDetailes(doctorName);
       }
	   
	   if(n == 4)
       {
		   System.out.println("Enter the Doctor id");
		   int doctorId = sc.nextInt();
		   si.removeDoctorDetails(doctorId);
		   System.out.println("Data remove Successfully.....");
       
       }
	   
	   if(n == 5)
       {
		   System.out.println("Enter the Patient ID");
		   int patientId = sc.nextInt();
		   System.out.println("Enter the Patient Name");
		   String patientName = sc.next();
		   System.out.println("Enter the Patient Mobile Number");
		   String  patientMobile = sc.next();
		   
		   PatientModel ptnmdl = new PatientModel(patientId, patientName, patientMobile);
		   si.addPatientDetails(ptnmdl);
		   System.out.println("Details add Successfully.....");
       
       } 
	   
	   if(n == 6)
       {
		   si.viewPatientNames();
       }
	   
	   if(n == 7)
       {
		   System.out.println("Enter the Patient Name");
		   String patientName = sc.next();
		   si.viewPatientDetailes(patientName);
       }
	   
	   if(n == 8)
       {
		   System.out.println("Enter the Patient id");
		   int patientId = sc.nextInt();
		   si.removePatientDetails(patientId);
		   System.out.println("Data remove Successfully.....");
       
       }
	   
	   if(n == 9)
       {
		   System.out.println("Enter the Token Number");
		   int tokenNumber = sc.nextInt();
		   System.out.println("Whate problem do you have");
		   String specialization = sc.next();
		   System.out.println("Enter the Patient Id");
		   int patientId = sc.nextInt();
		   si.patientAppointment(tokenNumber, specialization, patientId);
		   System.out.println("Appointment confirmed.....");
       
       }
	   
	   if(n == 10)
       {
		   System.out.println("Enter the Patient Id");
		   int patientId = sc.nextInt();
		   si.printAppointmentPrescription(patientId);
		   
       
       }
	   
   }
}
