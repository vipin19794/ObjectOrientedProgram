/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.2
 * Purpose  -   Reads in integers prints them in sorted order using Bubble Sort
 * fileName -   InsertionSort.java
 * Date     -   16/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
public class InsertionSort 
{

	public static void main(String[] args)
	{	
		System.out.println("how many word you are Entered");
		int num = Util.readingInteger();
		String arr[] = new String[num];
		
		System.out.println("Enter the word");
		for(int j=0; j<arr.length; j++)
		{   	
		    String s = Util.readingString();
			arr[j] = s;	
		}
		
		String sortedArray[] = Util.insertionSort(arr); 
		for(int i=0;i<sortedArray.length;i++)
		{
		   System.out.println(sortedArray[i]);
		}
	}

}
