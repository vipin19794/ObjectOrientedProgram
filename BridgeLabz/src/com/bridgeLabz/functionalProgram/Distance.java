/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) 
                to the origin (0, 0).
 * fileName -   Distance.java
 * Date     -   14/11/2019
 */

package com.bridgeLabz.functionalProgram;
import com.bridgeLabz.Utility.Util;
public class Distance
{

	public static void main(String[] args)
	{
		System.out.println("Enter the value Of x");
		int x1 = Util.readingInteger();
		System.out.println("Enter the value Of y");
		int y1 = Util.readingInteger();

		System.out.println("Distance = "+Util.distance(x1, y1));
	}

}
