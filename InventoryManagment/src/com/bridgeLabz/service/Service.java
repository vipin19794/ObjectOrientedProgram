/*
 * Author   -   VIPIN SHARMA 
 * fileName -   Service.java
 * Date     -   29/11/2019
 */

package com.bridgeLabz.service;

import java.io.IOException;

import com.bridgeLabz.model.Model;

public interface Service
{
	void add(Model il) throws IOException;
	void grainList() throws IOException;
	void price(String str) throws IOException; 
	void remove(String str) throws IOException;
}
