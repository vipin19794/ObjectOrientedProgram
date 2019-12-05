/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.3
 * Purpose  -   Generics for Search and Sort Algorithms
 * fileName -   GenericSort.java
 * Date     -   18/11/2019
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;
public class GenericSort
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Length of Array");
		int size = Util.readingInteger();
		Integer arr[] = new Integer[size];
		
		System.out.println("Enter the Element");
		for(int i=0; i<size; i++)
		{
			arr[i] = Util.readingInteger();
		}
		
		arr=Util.genericSort(arr);
		for(int ch:arr)
		{
			System.out.print(ch+" ");
		}
		
	}	

}
