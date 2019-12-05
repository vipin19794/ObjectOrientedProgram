/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.1
 * Purpose  -   calculate monthlyPayment that reads in three command-line arguments
 *              P, Y, and R and calculates the monthly payments you would have to make
 *              over Y years to pay off a P principal loan amount at R per cent interest compounded monthly
 * fileName -   MonthlyPayment.java
 * Date     -   16/11/2019
 */

package com.bridgeLabz.JUnitTesting;
import com.bridgeLabz.Utility.*;

public class MonthlyPayment
{	
	public static void main(String[] args)  
	{
		System.out.println("Enter principal loan amount : ");
		double P = Util.readingDouble();
		
		System.out.println("How many year to pay : ");
		double Y = Util.readingDouble();
		
		System.out.println("Enter rate of interest : ");
		double R = Util.readingDouble();
		
		double payment = Util.monthlyPayment(P, Y, R);
		System.out.println("monthly Payment = "+payment);
	}
}
