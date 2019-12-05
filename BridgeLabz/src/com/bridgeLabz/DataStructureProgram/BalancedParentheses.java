/*
 * Author   -   VIPIN SHARMA 
 * Version  -   1.5
 * Purpose  -   Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
                where parentheses are used to order the performance of operations. Ensure
                parentheses must appear in a balanced fashion.
 * fileName -   BalancedParentheses.java
 * Date     -   23/11/2019
 * 
 */
package com.bridgeLabz.DataStructureProgram;
import com.bridgeLabz.Utility.*;
import com.bridgeLabz.dataStructure.*;
public class BalancedParentheses 
{
public static void main(String[] args) 
{
   try 
   { 
    Stack<String> stack = new   Stack<String>();
    boolean res =false , flag=true;
    System.out.println("Enter the equation to find paranthesis is banlanced or not ");
	String  equation =  Util.readingString();
	String []arr  = equation.split("");//equation.tocharArray();
	for(int i = 0 ; i<arr.length ; i++) 
	{
	  if(arr[i].equals("(")||arr[i].equals("{")||arr[i].equals("[")) 
		{
		 stack.push(arr[i]);
		}
	  else if(arr[i].equals(")")||arr[i].equals("}")||arr[i].equals("]"))
	  {
	    String n=stack.pop();
	    if(n == null) 
		 {
	       flag =false;
		   System.out.println("not balanced");
		  }
	   }
   }
    if(flag) 
    {
     res = stack.isEmpty();
     if(res) 
     {
      System.out.println("balanced");
     
      }
     else {
    	 System.out.println("not balanced");
     }
    }
    else if(flag==true)
     {
    	  System.out.println("not balanced");
	 } 
	}
       catch(Exception e)
       {
		System.out.println(e);
	   }

}
		
}
