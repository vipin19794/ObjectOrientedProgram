/*
 * Author   -   VIPIN SHARMA 
 * fileName -   User.java
 * Date     -   02/12/2019
 */

package com.bridgeLabz.model;

public class User 
{
	private String userName;
    private int userShare;
    private int sharePrice;
    
    public User(String userName, int userShare, int sharePrice)
    {
   	 this.userName = userName;
   	 this.userShare = userShare;
   	 this.sharePrice = sharePrice;
    }
    public String getUserName()
    {
   	 return userName;
    }
    
    public int getUserShare()
    {
   	 return userShare;
    }
    
    public int getSharePrice()
    {
   	 return sharePrice; 
    }
}
