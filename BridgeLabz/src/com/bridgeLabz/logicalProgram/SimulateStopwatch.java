/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.5
 * Purpose  -   Stopwatch Program for measuring the time that elapses between the start and end clicks
 * fileName -   SimulateStopwatch.java
 * Date     -   15/11/2019
 */

package com.bridgeLabz.logicalProgram;
import  com.bridgeLabz.Utility.Util;

public class SimulateStopwatch
{

	public static void main(String[] args)
    {		
		System.out.println("you want to start time 'y/n'");
		char ch = Util.readingChar();
		if(ch == 'y' || ch == 'Y')
		{
			long str = Util.start();
			System.out.println("you want to stop time only 'y'");
			char cr = Util.readingChar();
			if(cr == 'y' || cr == 'Y')
			{
				long stp = Util.stop();
				long TotalTime = Util.calculteTime(str,stp);
				System.out.println("Total Time is "+TotalTime+" millisecond");		
			}
		}
		else
		{
			System.out.println("ok thanks.......");
		}
    }           
}
