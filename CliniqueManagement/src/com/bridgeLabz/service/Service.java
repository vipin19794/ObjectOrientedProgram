/*
 * Author   -   VIPIN SHARMA 
 * fileName -   Service.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.service;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgeLabz.model.DoctorModel;
import com.bridgeLabz.model.PatientModel;

public interface Service
{
	void addDoctorDetails(DoctorModel dcrmdl)throws IOException, ParseException;
	void viewDoctorNames()throws IOException, ParseException;
	void removeDoctorDetails(int doctorId)throws IOException, ParseException;
	void viewDoctorDetailes(String doctorName)throws IOException, ParseException;
	
	void addPatientDetails(PatientModel ptnmdl)throws IOException, ParseException;
	void viewPatientNames()throws IOException, ParseException;
	void viewPatientDetailes(String patientName)throws IOException, ParseException;
	void removePatientDetails(int patientId)throws IOException, ParseException;
	
	void patientAppointment(int tokenNumber, String specialization, int patientId)throws IOException, ParseException;
	void printAppointmentPrescription(int patientId)throws IOException, ParseException;
	
}
