/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? 
 * fileName -   CouponNumber.java
 * Date     -   15/11/2019
 */

package com.bridgeLabz.logicalProgram;
import com.bridgeLabz.Utility.Util;

public class CouponNumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Coupon Number");
		int num = Util.readingInteger();
		
		boolean s = Util.couponNumber(num);
		if(s == true)
		{
			System.out.println("Coupon number "+num+" Match"+".......you won");
		}
		else
		{
			System.out.println("Coupon number "+num+" not Match"+"......you loss");
		}
	}
}
