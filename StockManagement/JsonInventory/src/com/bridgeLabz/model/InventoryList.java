package com.bridgeLabz.model;

public class InventoryList
{
		 private String name;
		 private double weight;
		 private double price;
		 
		 public InventoryList(String name, double weight, double price)
		 {
			 this.name = name;
			 this.weight = weight;
			 this.price =price;
		 }
		 	
		 public String getName()
		 {
			 return name;
		 }
		 
		 public double getWeight()
		 {
			 return weight;
		 }
		 
		 public double getPrice()
		 {
			 return price;
		 }

}
