/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.8
 * Purpose  -   Read a List of Numbers from a file and arrange it ascending 
                Order in a Linked List. Take user input for a number, if found then
                pop the number out of the list else insert the number in appropriate position
 * fileName -   OrderedList.java
 * Date     -   22/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.dataStructure.*;
import com.bridgeLabz.Utility.*;
public class OrderedList
{
public static void main(String[] args) throws Exception 
{
	LinkedList<Integer> ai=new LinkedList<Integer>();
	String file;
	Integer find;
	System.out.println("Enter the file name");
	file=Util.readString();

	String[] s=Util.readFile(file);

	  Integer[] arr=new Integer[s.length];
	  for(int i=0;i<s.length;i++)
	  {
         arr[i]=Integer.parseInt(s[i]); 
       }
	  System.out.println("Enter a number to find");
	  find=Util.readingInteger();
	  Util.genericSort(arr);
	   
	    for(int j=0;j<arr.length;j++)
	    {
	    ai.add(arr[j]);
	    }
	    
	    if(ai.search(arr, find)) 
	    {
	       ai.remove(find);
	    }
	    else
	    {
	       ai.addAt(find,ai.orderIndex(find));
	    }
	   ai.show();
	   ai.toFile();	   
   }
}
