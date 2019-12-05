package com.bridgeLabz.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeLabz.model.InventoryList;

public interface InventoryService
{	
	void writeDataToJsonFile(InventoryList il) throws FileNotFoundException, IOException, ParseException;
	void readDataFromJsonFile() throws FileNotFoundException, IOException, ParseException;
}
