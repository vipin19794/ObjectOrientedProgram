/*
 * Author   -   VIPIN SHARMA 
 * fileName -   Company.java
 * Date     -   03/12/2019
 */

package com.bridgeLabz.model;
public class Company
{
     private String compName;
     private int compShare;
     private int sharePrice;
     
     public Company(String compName, int compShare, int sharePrice)
     {
    	 this.compName = compName;
    	 this.compShare = compShare;
    	 this.sharePrice = sharePrice;
     }
     public String getCompName()
     {
    	 return compName;
     }
     
     public int getCompShare()
     {
    	 return compShare;
     }
     
     public int getSharePrice()
     {
    	 return sharePrice; 
     }

}
