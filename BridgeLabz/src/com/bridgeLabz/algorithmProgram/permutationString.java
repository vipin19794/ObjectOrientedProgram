/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.4
 * Purpose  -   return all permutations of a String using iterative method and Recursion method
 * fileName -   permutationString.java
 * Date     -   16/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
public class permutationString
{
		  
	public static void main(String[] args) 
	{ 
		System.out.println("Enter the word");
	    String s = Util.readingString(); 
	    printPermutn(s, ""); 
	} 
	
	public static void printPermutn(String str, String ans) 
    { 
	  
	        if (str.length() == 0)
	        { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	  
	        for (int i = 0; i < str.length(); i++)
	        { 
	            char ch = str.charAt(i); 
	            String ros = str.substring(0, i)+str.substring(i + 1); 
	 
	            printPermutn(ros, ans + ch); 
	        } 
    }
}
