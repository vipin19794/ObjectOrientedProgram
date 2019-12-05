/*
 * Author   -   VIPIN SHARMA
 * Version  -   1.3
 * Purpose  -   this program print the harmonic Harmonic Number , Input given by the User 
 * fileName -   NthHarmonicSeries.java
 * Date     -   12/11/2019
 */

package com.bridgeLabz.basicProgram;
import com.bridgeLabz.Utility.Util;

class NthHarmonicSeries
{         
    public static void main (String[] args)
    { 
    	     System.out.println("Enter the Number for Nth harmonic value");
             int n = Util.readingInteger();
        
             System.out.println(Util.nthHarmonic(n));
    } 
}
