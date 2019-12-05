/*
 * Author   -   VIPIN SHARMA 
 * fileName -   Service.java
 * Date     -   03/12/2019
 */


package com.bridgeLabz.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.Company;
import com.bridgeLabz.model.User;

public interface Service 
{
	void addCompanyDetails(Company mdl)throws FileNotFoundException, IOException, ParseException;
	void removeCompanyName(String companyName)throws FileNotFoundException, IOException, ParseException;
	void viewAllCompanyNames()throws FileNotFoundException, IOException, ParseException;
	void printStockReport(String companyName)throws FileNotFoundException, IOException, ParseException;
	
	void addUserDetails(User mdl)throws FileNotFoundException, IOException, ParseException;
	void removeUserName(String userName)throws FileNotFoundException, IOException, ParseException;
	void printUserReport(String userName)throws FileNotFoundException, IOException, ParseException;
	
	void purchaseShare(String companyName,String userName,int share)throws FileNotFoundException, IOException, ParseException;
	void sellShare(String companyName,String userName,int share)throws FileNotFoundException, IOException, ParseException;
}
