/*
 * Author   -   VIPIN SHARMA 
 * Version  -   3.8
 * Purpose  -   Create CliniqueManagement Project (----Add Company details, remove Company details, view All Company names,
 *              view company Details, Add User Details, remove User details----).
 * fileName -   Main.java
 * Date     -   02/12/2019
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
    	 System.out.println("Press 3 view All Company names");
    	 System.out.println("Press 4 view company Details");
    	 System.out.println("Press 5 Add User Details");
    	 System.out.println("Press 6 remove User details");
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
    		 si.viewCompanyDetails(companyName);
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
     }
}
