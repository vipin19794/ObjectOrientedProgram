/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.4
 * Purpose  -   Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
                Store the prime numbers in a 2D Array, the first dimension represents the 
                range 0-100, 100-200, and so on. While the second dimension represents the 
                prime numbers in that range
 * fileName -   Prime2D.java
 * Date     -   25/11/2019
 * 
 */

package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.Utility.*;;

public class Prime2D
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
	
		for (int i[] : prime) 
		{
			for (int j : i)
			{
				if(j!=-1&& j!=1)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println("\n");
		}
	
		
	}
}
