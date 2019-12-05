/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.6
 * Purpose  -   To Merge Sort an array, we divide it into 
                two halves, sort the two halves independently,
                and then merge the results to sort the full array.
 * fileName -   MergeSort.java
 * Date     -   18/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import java.util.Arrays;
import com.bridgeLabz.Utility.*;
public class MergeSort
{

	  public static void main(String[] args)
	  {   
	      System.out.println("how many word you are Entered");
	      int n = Util.readingInteger();
	      String[] input = new String[n];
	      System.out.println("Enter the word");
	      for(int i=0; i<n; i++)
	      {    
	    	  input[i] =Util.readingString();
	      }

	      System.out.println("array before sorting");
	      System.out.println(Arrays.toString(input));
	      System.out.println();

	      Util.mergesort(input);

	      System.out.println("array after sorting using mergesort algorithm");
	      System.out.println(Arrays.toString(input));

	  }

}
