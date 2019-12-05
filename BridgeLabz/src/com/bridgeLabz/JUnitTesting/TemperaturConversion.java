/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   fahrenheit convert in Celsius and Celsius convert in fahrenheit, given input by user
 * fileName -   TemperaturConversion.java
 * Date     -   16/11/2019
 */

package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;

public class TemperaturConversion 
{ 
	public static void main(String[] args)
	{
	     
	    System.out.println("Enter the Value above 30");
	    double num = Util.readingDouble();
	    
	    System.out.println("whate you want to do");
	    System.out.println("fahrenheit to celsius press 1");
	    System.out.println("celsius to fahrenheit press 2");
	    double val = Util.readingInteger();
	    if(val == 1)
	    {	
	       System.out.println(Util.fahrenheitToCelsius(num));
	    }
	    if(val == 2)
	    {
            System.out.println(Util.celsiusToFahrenheit(num));
	    }
	}
}
