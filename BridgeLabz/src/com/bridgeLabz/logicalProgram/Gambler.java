/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.3
 * Purpose  -    Play till the gambler is broke or has won, Print Number of Wins and Percentage of Win and Loss.
 * fileName -   Gambler.java
 * Date     -   15/11/2019
 */

package com.bridgeLabz.logicalProgram;
import com.bridgeLabz.Utility.Util;

public class Gambler
{
	public static void main(String[] args)
	{
	    System.out.println("Enter the Stake");
		int stake  = Util.readingInteger();
		System.out.println("Enter the Goal");
        int goal   = Util.readingInteger();
        System.out.println("Enter the Trails");
        int trials = Util.readingInteger();   

        Util.gamblerGame(stake,goal,trials);      
	}
}
