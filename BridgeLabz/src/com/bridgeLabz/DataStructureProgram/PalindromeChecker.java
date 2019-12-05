/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.3
 * Purpose  -   A palindrome is a string that reads the same forward and backward,
 *              for example, radar, toot, and madam. We would like to construct an algorithm 
 *              to input a string of characters and check whether it is a palindrome.
 * fileName -   PalindromeChecker.java
 * Date     -   25/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.dataStructure.*;
import com.bridgeLabz.Utility.*;

public class PalindromeChecker 
{
   public static void main(String[] args) 
   {
	Queue<Character> que = new Queue<Character>();
		
		System.out.println("eneter the word for Palindrome Check");
		String word =  Util.readingString();
		char arr[] = word.toCharArray();
		for(char ch : arr) 
		{
		 que.addFront(ch);  
		}
        String s = "";
        for(int j=0;j<arr.length; j++) 
        {
    	    s = s + que.removeFront(); 
        }
        System.out.println(s);
        if(word.equals(s)) 
        {
     	   System.out.println("palindrome");
        }
        else 
        {
    	    System.out.println("not a palidrome");
        }
		
   }  
}