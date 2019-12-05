/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.2
 * Purpose  -   find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots
 * fileName -   Quadratic.java
 * Date     -   14/11/2019
 */


package com.bridgeLabz.functionalProgram;
import com.bridgeLabz.Utility.Util;
public class Quadratic 
{

	public static void main(String[] args)
	{	 
	        System.out.println("Enter Value Of A");
	        double a = Util.readingInteger();
	        System.out.println("Enter Value Of B");
	        double b = Util.readingInteger();
	        System.out.println("Enter Value Of c");
	        double c = Util.readingInteger(); 
	        
	        String str = Util.quadratic(a,b,c);
	        System.out.println(str);
    }
}
