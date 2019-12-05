/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   Decimal convert in to Binary, input number given by the user 
 * fileName -   ToBinary.java
 * Date     -   16/11/2019
 */


package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;
public class ToBinary
{ 
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		int num = Util.readingInteger();
		String str = Util.toBinary(num);
		System.out.println(str);
		
	}
}
