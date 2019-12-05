/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
 * fileName -   PowerOf2.java
 * Date     -   12/11/2019
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;

public class PowerOf2
{
	public static void main(String args[])
	{
		System.out.println("Enter the number for print for power of 2");
		int num = Util.readingInteger();
		if(num <= 31)
		{
			Util.powerof2(num);
		}
		else
		{
			Util.checkLeapYear(num);
		}
	}	
	 
}