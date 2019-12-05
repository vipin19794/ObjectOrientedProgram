/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.6
 * Purpose  -   Read the Text from a file, split it into words and arrange it as 
                Linked List. Take a user input to search a Word in the List. If the Word is not
                found then add it to the list, and if it found then remove the word from the List.
                In the end save the list into a file
 * fileName -   UnOrderedList.java
 * Date     -   22/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.Utility.Util;
import com.bridgeLabz.dataStructure.*;
public class UnOrderedList
{
	public static void main(String[] args) throws Exception
	{
		LinkedList<String> al=new LinkedList <String> ();
		System.out.println("enter the file name");
		String file=Util.readingString();
		System.out.println("enter the word to find");
		String find=Util.readingString();	
		String s[]=Util.readFile(file);
		
		for(int i=0;i<s.length;i++)
		{
			al.add(s[i]);
		}
		
		if(al.search(s, find))
		{
			al.remove(find);
		}
		else
		{
			al.add(find);
		}
		
		al.show();
		System.out.println(al.size());	
		al.toFile();
	}
}
