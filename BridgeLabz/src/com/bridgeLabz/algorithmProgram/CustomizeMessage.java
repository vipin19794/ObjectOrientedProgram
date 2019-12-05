/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.0
 * Purpose  -   Customize Message,Use Regex to replace name, full name, Mobile#, and Date with proper value.
 * fileName -   CustomizeMessage.java
 * Date     -   18/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.Util;

public class CustomizeMessage
{
	public static void main(String[] args)
	{
		System.out.println("Enter the first Name");
		String fname = Util.readingString();
		System.out.println("Enter the full Name");
		String fullname = Util.readingString();
		System.out.println("Enter the contact number");
		String contact = Util.readingString();
		System.out.println("Enter the date");
		String date = Util.readingString();
		System.out.println(Util.customizeMessage(fname, fullname, contact, date));

	}

}
