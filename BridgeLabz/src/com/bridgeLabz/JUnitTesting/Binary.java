/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.8
 * Purpose  -   this program Decimal convert to Binary, Binary number reverse After Binary convert to Decimal, given input by user
 * fileName -   Binary.java
 * Date     -   16/11/2019
 */


package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;
public class Binary
{ 
	public static void main(String args[])
	{
		System.out.println("Enter the NUmber");
		int num = Util.readingInteger();
	
		if(num >255)
		{
			System.out.println("Length of this binary representation is grater than 8 bits");
		}
		else
		{
			String str1 = Util.toBinary(num);
			System.out.println("your binary number is = "+str1);
			
			String str2 = Util.stringReverse(str1);
			System.out.println("your reverse number is = "+str2);
			
			String str3 = Util.toDecimal(str2);
			System.out.println("your Decimal number is = "+str3);
		}	
	}
}
