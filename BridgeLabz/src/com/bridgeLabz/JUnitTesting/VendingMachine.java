/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.5
 * Purpose  -   There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned
                by Vending Machine. Write a Program to calculate the minimum number of Notes
                as well as the Notes to be returned by the Vending Machine as a Change
 * fileName -   VendingMachine.java
 * Date     -   15/11/2019
 */

package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.Util;
public class VendingMachine
{
	public static void main(String[] args)
	{   
		int change[] = {1000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the Amount"); 
		int amt = Util.readingInteger();
		int notes[] =Util.vendingMachine(amt);
		for(int i=0;i<notes.length;i++)
		System.out.println("the "+change[i]+" are "+notes[i]);
	}
}
