/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.5
 * Purpose  -   Flip Coin and print percentage of Heads and Tails
 * fileName -   FlipCoin.java
 * Date     -   11/11/2019
 * 
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;
public class FlipCoin
{

	public static void main(String[] args)
	{
		System.out.println("The number of times to Flip Coin");
		int numberOfFlipCoin = Util.readingInteger();
		
		String str = Util.findPercentageOfHeadandTell(numberOfFlipCoin);	
		System.out.println(str);
	}
}