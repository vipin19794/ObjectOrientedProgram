/*
 * Author   -   VIPIN SHARMA 
 * Version  -   5.2
 * Purpose  -   Extend the above program to Create InventoryManager to manage the Inventory.
 *              The Inventory Manager will use InventoryFactory to create Inventory Object from JSON.
                The InventoryManager will call each Inventory Object in its list to calculate the 
                Inventory Price and then call the Inventory Object to return the JSON String. 
                The main program will be with InventoryManager

 * fileName -   Main.java
 * Date     -   29/11/2019
 */

package com.bridgeLabz.controller;
import java.io.IOException;
import java.util.Scanner;
import com.bridgeLabz.model.Model;
import com.bridgeLabz.serviceImplement.ServiceImplement;
public class Main
{

	public static void main(String[] args) throws IOException 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ServiceImplement isi = new ServiceImplement();
		
		System.out.println("press 1 for ADD Grain");
		System.out.println("press 2 for Grain List");
		System.out.println("press 3 for Total Price");
		System.out.println("press 4 for remove data");
		int num = sc.nextInt();
		if(num == 1)
		{
		    System.out.println("Enter the Grain name");
		    String name = sc.next();
		
	    	System.out.println("Enter the Grain weight");
		    double weight = sc.nextDouble();
//		    System.out.println(weight);
		
	    	System.out.println("Enter the Grain price");
		    double price = sc.nextDouble();
//		    System.out.println(price);
				
		    Model il = new Model(name, weight, price);
		    isi.add(il);
		}
		if(num == 2)
		{
		    try
		    {
				isi.grainList();
				
			} catch (Exception e) {e.printStackTrace();}
		}
		
		if(num == 3)
		{
			System.out.println("Enter the Grain name");
			String str = sc.next();
		    isi.price(str);
		} 
		if(num == 4)
		{
			System.out.println("Enter the Grain name");
			String str = sc.next();
			isi.remove(str);
			
		}
	}

}
