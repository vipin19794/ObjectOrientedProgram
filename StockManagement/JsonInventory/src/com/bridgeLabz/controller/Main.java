
package com.bridgeLabz.controller;
import com.bridgeLabz.serviceImplement.*;
import com.bridgeLabz.model.*;
import com.bridgeLabz.service.*;

import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;
public class Main 
{
	public static void main(String[] args) throws IOException, ParseException
	{
		Scanner sc = new Scanner(System.in);
		InventoryServiceImplement isi =new InventoryServiceImplement();
		System.out.println("press 1 for write data");
		System.out.println("press 2 for read data");
		int num = sc.nextInt();
		if(num == 1)
		{
		    System.out.println("Enter the Grain name");
		    String name = sc.next();
		
	    	System.out.println("Enter the Grain weight");
		    double weight = sc.nextDouble();
		
	    	System.out.println("Enter the Grain price");
		    double price = sc.nextDouble();
				
		    InventoryList il = new InventoryList(name, weight, price);
		    isi.writeDataToJsonFile(il);
		}
		if(num == 2)
		{
		    isi.readDataFromJsonFile();
		}
	}

}
