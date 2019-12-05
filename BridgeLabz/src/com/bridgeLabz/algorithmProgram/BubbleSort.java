/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.1
 * Purpose  -   Reads in integers prints them in sorted order using Bubble Sort
 * fileName -   BubbleSort.java
 * Date     -   16/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
public class BubbleSort
{
	public static void main(String[] args) 
	{		
		System.out.println("how many number you are Entered");
		int num = Util.readingInteger();   
		int arr[] = new int[num];
		
		System.out.println("Enter the word");
		for(int j=0; j<num; j++)  
		{   
			arr[j]= Util.readingInteger();		
		}	
		
		Util.bubbleSort(arr);
		for(int i:arr)
		{
			System.out.println(i);;
		}
	}	
}
