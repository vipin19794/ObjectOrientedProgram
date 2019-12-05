/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.1
 * Purpose  -   this program year Leap year Or Not
 * fileName -   LeapYear.java
 * Date     -   11/11/2019
 * 
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;

public class LeapYear 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Year");
		int num = Util.readingInteger();
		System.out.println(Util.checkLeapYear(num));	
	}

}