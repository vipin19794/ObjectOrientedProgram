/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.1
 * Purpose  -   input String by user and replace word Of String, given By user
 * fileName -   ReplaceString.java
 * Date     -   12/11/2019
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;

public class ReplaceString
{
	public static void main(String[] args)
	{
         System.out.println("Enter the String");
         String msg = Util.readingString();
         System.out.println("Which word you want to replace");
         String replacePlace = Util.readingString();
         System.out.println("Whate you want replace");
         String rplce = Util.readingString();
         Util.replaceMessage(msg,rplce,replacePlace); 
	}
}
