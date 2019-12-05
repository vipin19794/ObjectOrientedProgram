/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.1
 * Purpose  -   Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.  
 * fileName -   PrimeNumbers.java
 * Date     -   18/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;

public class PrimeNumbers
{
	public static void main(String[] args)
	{
		System.out.println("Range of print the prime number");
		int num = Util.readingInteger();
		
		Util.primeNumbers(num);
	}
}
