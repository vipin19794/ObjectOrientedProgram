/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.2
 * Purpose  -   takes a command-line argument N, asks you to think
                of a number between 0 and N-1, where N = 2^n, and always 
                guesses the answer with n questions.
 * fileName -   guessGame.java
 * Date     -   18/11/2019
 * 
 */

package com.bridgeLabz.algorithmProgram;
import com.bridgeLabz.Utility.*;

public class guessGame 
{
	
	public static void main(String[] args)
	{

		System.out.println("how many Element you print");
		int size = Util.readingInteger();
		int arr[] = new int[size];
		
		System.out.println("Enter the element");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Util.readingInteger();
		}
		
		System.out.println("Enter the Guessing value");
		int n = Util.readingInteger();
		System.out.println(Util.guessGame(n,arr));
           
	}
}
