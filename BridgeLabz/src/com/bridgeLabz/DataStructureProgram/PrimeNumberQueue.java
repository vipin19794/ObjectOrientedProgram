/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.4
 * Purpose  -   Add the Prime Numbers that are Anagram in the Range of 0 - 1000 
                in a Queue using the Linked List and Print the Anagrams from the Queue. 
                Note no Collection Library can be used.
 * fileName -   PrimeNumberQueue.java
 * Date     -   26/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.Utility.*;
import com.bridgeLabz.dataStructure.*;
public class PrimeNumberQueue
{
	public static void main(String[] lligs) 
	{
		Queue<Integer> qui = new Queue<Integer>();
		LinkedList<Integer> lli = new LinkedList<Integer>();
		
		boolean b;
		for (int j = 2; j <= 1000; j++) 
		{
			b = true;
			for (int i = 2; i < j / 2; i++) 
			{
				if (j % i == 0)
				{
					b = false;
					break;
				}
			}
			if (b)
			lli.add(j);
		}
		for (int i = 0; i < lli.size(); i++) 
		{
			for (int j = i + 1; j < lli.size(); j++) 
			{
				if (Util.anagram(lli.get(i), lli.get(j))) 
				{
					qui.enqueue(lli.get(i));
					qui.enqueue(lli.get(j));
				}
			}
		}
				
	    qui.dispPrime();
	}

}
