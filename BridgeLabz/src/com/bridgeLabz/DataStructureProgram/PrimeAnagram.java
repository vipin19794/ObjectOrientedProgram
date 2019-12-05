/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.2
 * Purpose  -   Prime Number Program and store only the numbers in that range that are Anagrams.
                For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range. Further
                store in a 2D Array the numbers that are Anagram and numbers that are not Anagram
 * fileName -   PrimeAnagram.java
 * Date     -   25/11/2019
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.Utility.*;
public class PrimeAnagram 
{
	public static void main(String[] args)  
	{
		int array[][]=new int[10][100];
		int prime[][]=new int[10][100];
		
		int temp=1;
		for (int i = 0; i< 10; i++) 
		{
			for (int j = 0; j < 100; j++) 
			{
				array[i][j]=temp;
				temp++;
			}
		}
		
		for (int i = 0; i <10; i++) 
		{
			for (int j = 0; j < 100; j++) 
			{
				if(Util.checkPrime(array[i][j]))
				{
				prime[i][j]=array[i][j];
				}
				else
				{
					prime[i][j]=-1;
				}
			}
		}
		for(int i = 0 ; i<10 ; i++) 
		{
		  for(int j = 0 ; j<100;j++)
		  {
			  if(prime[i][j]!=-1) 
			  {
			     for(int k = j+1 ; k <100;k++ )
			     {
			       if(prime[i][k]!=-1&& Util.anagram(prime[i][j],prime[i][k]))
			       {
			    	 System.out.println(prime[i][j]+" "+ prime[i][k]);
			       }
		         }
		      }
		   }
		}
	}
}
	
