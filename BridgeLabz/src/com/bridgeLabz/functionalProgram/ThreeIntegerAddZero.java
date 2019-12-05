/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.3
 * Purpose  -   Sum of three Integer adds to ZERO
 * fileName -   ThreeIntegerAddZero.java
 * Date     -   14/11/2019
 */

package com.bridgeLabz.functionalProgram;
import com.bridgeLabz.Utility.Util;
public class ThreeIntegerAddZero
{
	public static void main(String[] args)
	{
	   System.out.println("Enter the Length of Array");
	   int length = Util.readingInteger();
	   int[] arr = new int[length]; 
	   System.out.println("Enter the value for Array");
	   for(int y=0; y<arr.length; y++)
	   {
		   int num = Util.readingInteger();
		   arr[y] = num;
	   }
	   System.out.println(threeIntegerSumZero(arr));
	}
	
	public static boolean threeIntegerSumZero(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				for(int k=0; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k] == 0)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
}
