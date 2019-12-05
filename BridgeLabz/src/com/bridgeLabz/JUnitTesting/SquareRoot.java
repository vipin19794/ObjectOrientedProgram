/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.1
 * Purpose  -   square root of a nonnegative number c given in the input
 * fileName -   SquareRoot.java
 * Date     -   16/11/2019
 */

package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;
public class SquareRoot
{
	
	public static void main(String[] args) 
	{ 
		System.out.println("Enter a positive number to find Square Root : ");
		double c = Util.readingDouble();
		double sqrt = Util.squareRoot(c);
		System.out.println("Square Root = "+sqrt);
	}	
}
