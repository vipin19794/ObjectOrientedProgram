/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.7
 * Purpose  -   static function that takes a date as input and prints the 
 *              day of the week that date falls on. Your program should take
 *              three command-line arguments: m (month), d (day), and y (year)
 * fileName -   DayOfWeek.java
 * Date     -   16/11/2019
 */

package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;
import java.time.*;  
public class DayOfWeek 
{
      public static void main(String[] args)
      {
	     System.out.println("Enter the day"); 
	     int day = Util.readingInteger();
	     System.out.println("Enter the month");
	     int month = Util.readingInteger();
	     System.out.println("Enter the year");
	     int year = Util.readingInteger();
	     System.out.println(Util.calculateDay(day, month, year));	
      }	
}

