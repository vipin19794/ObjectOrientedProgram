/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.4
 * Purpose  -    program to find the prime numbers that are Anagram and Palindrome 
 * fileName -   FindPrimeAnagramPalindrom.java
 * Date     -   18/11/2019
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;

public class FindPrimeAnagramPalindrom
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int n = Util.readingInteger();
		
		 boolean rtn = Util.checkPrime(n);
		 if(rtn == true)
		 {
			    String s = Integer.toString(n);
				String s1 = s;
				boolean artn = Util.twoStringAnagram(s,s1);
				if(artn == true)
				{
					
					boolean bln = Util.palindromInteger(n);
					if(bln == true)
					{
						System.out.println("number Prime");
						System.out.println("number Anagram");
						System.out.println("number Palindrom");
	
					}
					else
					{
						System.out.println("number not Palindrom");
					}
				}
				else
				{
					System.out.println("number not Anagram");
				}
		 }
		 else
		 {
			 System.out.println("number not Prime");
		 }
	
	}

}
