/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.2
 * Purpose  -   Take string from user and replace the word in String
 * fileName -   Factorial.java
 * Date     -   11/11/2019
 * 
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;
public class Factorial
{
	public static void main(String[] args)
	{
		System.out.println("Enter the value");
		int n = Util.readingInteger();

		System.out.println(Util.fact(n));
	}
}
