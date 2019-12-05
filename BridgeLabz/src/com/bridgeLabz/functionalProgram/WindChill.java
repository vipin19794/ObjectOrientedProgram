/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.1
 * Purpose  -   takes two double command-line arguments t and v an,
                prints the wind chill. Use Math.pow(a, b) to compute ab
 * fileName -   WindChill.java
 * Date     -   14/11/2019
 * 
 */

package com.bridgeLabz.functionalProgram;
import com.bridgeLabz.Utility.Util;

public class WindChill
{
	public static void main(String[] args)
	{
            System.out.println("Enter the Air temprature");
            double at = Util.readingInteger();
            System.out.println("Enter the Wind Speed");
            double ws = Util.readingInteger();
            
            System.out.println("WindChill Temprature = "+Util.windChill(at,ws));
            
	}
}
