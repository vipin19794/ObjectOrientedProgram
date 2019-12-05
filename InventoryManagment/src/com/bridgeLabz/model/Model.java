/*
 * Author   -   VIPIN SHARMA 
 * fileName -   Model.java
 * Date     -   29/11/2019
 */

package com.bridgeLabz.model;

public class Model 
{
		private String name;
		 private double weight;
		 private double price;
		 
		 public Model(String name, double weight, double price)
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
