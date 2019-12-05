/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.5
 * Purpose  -   Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a
                Stack using the Linked List and Print the Anagrams in the Reverse Order.
                Note no Collection Library can be used.
 * fileName -   PrimeNumberStack.java
 * Date     -   26/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.dataStructure.*;
import com.bridgeLabz.Utility.*;
public class PrimeNumberStack
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
	   LinkedList<Integer> al=new LinkedList<Integer>();
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
					al.add(j);
			}

			for (int i = 0; i < al.size(); i++) 
			{
				for (int j = i + 1; j < al.size(); j++) 
				{
					if (Util.anagram(al.get(i), al.get(j))) 
					{
						stack.push(al.get(i));
						stack.push(al.get(j));	
					}
					
					
				}	
			}
			stack.disp();
		}
}
