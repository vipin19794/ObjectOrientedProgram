/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.3
 * Purpose  -    Read in a list of words from File. Then prompt the user 
                 to enter a word to search the list. The program reports if
                 the search word is found in the list.
 * fileName -   BinarySearch.java
 * Date     -   16/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
import java.io.*;

public class BinarySearch
{
	public static void main(String[] args) throws IOException
	{  
		System.out.println("Enter the Name");
		String sr = Util.readingString(); 
		
		System.out.println("whate you want to do");
		System.out.println("check your name in list press 'y'");
		System.out.println("add your name in list press 'a'");
		char c = Util.readingChar(); 
		if(c == 'y' || c == 'Y') 
		{
			 boolean b = Util.checkName(sr);  
			 System.out.println(b);	 
		}
		if(c == 'a' || c == 'A') 
		{
			Util.addName(sr); 
		}
		
	}
	
}