/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.7
 * Purpose  -    A library for reading in 2D arrays of integers, doubles, or booleans from 
                 standard input and printing them out to standard output.
 * fileName -   TwoDArray.java
 * Date     -   13/11/2019
 */

package com.bridgeLabz.functionalProgram;
import com.bridgeLabz.Utility.Util;
public class TwoDArray
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of rows");
		int rows = Util.readingInteger();
		System.out.println("Enter the number of columns");
		int columns = Util.readingInteger();
		
		System.out.println("Whate you want which type array");
	    System.out.println("1 : Integer Type");
	    System.out.println("2 : Double Type");
	    System.out.println("3 : Boolean Type");
	    int n = Util.readingInteger();
	    
	    switch(n) 
	    {
	       case 1:
	    	  int a[][] = Util.integer2DArray(rows,columns);
	    	  Util.printInteger2DArray(a,rows,columns);
	       break;
	       
	       case 2:
	    	   double d[][] = Util.double2DArray(rows,columns);
	    	   Util.printDouble2DArray(d,rows,columns);
	       break;
	       
	       case 3:
         	    boolean bool[][] = Util.boolean2DArray(rows,columns);
         	   Util.printBoolean2DArray(bool,rows,columns);
	   	   break;
	   	   
	   	   default:
	   		   System.out.println("you are not selected any type");
	   		   System.out.println("Please try again !");
	    }
	}
}

