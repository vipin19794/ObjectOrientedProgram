/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.0
 * Purpose  -   One string is an anagram of another
                if the second is simply a rearrangement of the first. For example, 
                'heart' and 'earth' are anagrams.
 * fileName -   TwoStringAnagram.java
 * Date     -   18/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
public class TwoStringAnagaram
{
	public static void main(String[] args)
	{	
		System.out.println("Enter the first String");
		String s1 = Util.readingString();
		System.out.println("Enter the second String");
		String s2 = Util.readingString();
		
		System.out.println(Util.twoStringAnagram(s1,s2));
	}
}
