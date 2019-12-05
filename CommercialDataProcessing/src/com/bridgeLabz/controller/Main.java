/*
 * Author   -   VIPIN SHARMA 
 * Version  -   5.7
 * Purpose  -   Create CommercialDataProcessing Project (----Add Company details, remove Company details, view All Company Names, Print Stock report, 
 *              Add User Details, remove User details, Print User report, purchase share, Sell share----).
 * fileName -   Main.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.controller;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.*;
import com.bridgeLabz.serviceImplement.*;
public class Main
{
     public static void main(String[] args) throws IOException, ParseException
     {
    	 @SuppressWarnings("resource")
		 Scanner sc = new Scanner(System.in);
    	 serviceImplement si = new serviceImplement();
    	 System.out.println("Press 1 Add Company details");
    	 System.out.println("Press 2 remove Company details");
    	 System.out.println("Press 3 view All Company Names");
    	 System.out.println("Press 4 Print Stock report");
    	 System.out.println("Press 5 Add User Details");
    	 System.out.println("Press 6 remove User details");
    	 System.out.println("Press 7 Print User report");
    	 System.out.println("Press 8 purchase share");
    	 System.out.println("Press 9 Sell share");
    	 int n = sc.nextInt();
    	 
    	 if(n == 1)
    	 {
    		System.out.println("Enter the Company name");
    		String compName = sc.next();
    		System.out.println("Enter the Company share");
    		int campShare = sc.nextInt();
    		System.out.println("Enter the share price");
    		int sharePrice = sc.nextInt();
    		
    		Company mdl = new Company(compName,campShare,sharePrice);
    		si.addCompanyDetails(mdl);
    	 }
    	 if(n == 2)
    	 {
    		 System.out.println("Enter the company name");
    		 String companyName = sc.next();
    		 si.removeCompanyName(companyName);
    	 }
    	 
    	 if(n == 3)
    	 {
    		 
    		 si.viewAllCompanyNames();
    	 }
    	 
    	 if(n == 4)
    	 {
    		 System.out.println("Enter the company name");
    		 String companyName = sc.next();
    		 si.printStockReport(companyName);
    	 }
    	 if(n == 5)
    	 {
    		System.out.println("Enter the User name");
    		String userName = sc.next();
    		System.out.println("Enter the User share");
    		int userShare = sc.nextInt();
    		System.out.println("Enter the share price");
    		int sharePrice = sc.nextInt();
    		
    		User mdl = new User(userName,userShare,sharePrice);
    		si.addUserDetails(mdl);
    	 }
    	 
    	 if(n == 6)
    	 {
    		 System.out.println("Enter the user name");
    		 String userName = sc.next();
    		 si.removeUserName(userName);
    	 }
    	 
    	 if(n == 7)
    	 {
    		 System.out.println("Enter the user name");
    		 String userName = sc.next();
    		 si.printUserReport(userName);
    	 }
    	 if(n == 8)
    	 {
    		 System.out.println("Enter the Company name");
    		 String companyName = sc.next();
    		 System.out.println("Enter the User name");
    		 String userName = sc.next();
    		 System.out.println("how many share you want purchse");
    		 int share = sc.nextInt();
    		 si.purchaseShare(companyName,userName,share);
    	 }
    	 
    	 if(n == 9)
    	 {
    		 System.out.println("Enter the Company name");
    		 String companyName = sc.next();
    		 System.out.println("Enter the User name");
    		 String userName = sc.next();
    		 System.out.println("how many share you want sell");
    		 int share = sc.nextInt();
    		 si.sellShare(companyName,userName,share); 
    	 }
     }     
}
