/*
 * Author   -   VIPIN SHARMA 
 * Version  -   4.7
 * Purpose  -   Create addressBook Project (----Create address book,open address book,Add person,Remove person,check details,manage details And 
 *              change firstName, LastName, city, state,zipcode----). 
 * fileName -   AddressBookController.java
 * Date     -   04/12/2019
 * 
 */
package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.Utility.Utility;
import com.bridgelabz.addressbook.serviceImpl.AddressBookImp;

public class AddressBookController {

	public static void main(String[] args) throws Exception
	{
		AddressBookImp addressbook=new AddressBookImp();
		int num=1;
		while(num==1){
			System.out.println("Press Number for Option****************************************");
			System.out.println("press 1 Create address book");
			System.out.println("press 2 open address book");
			System.out.println("press 3 Exit");
			switch(Utility.GetInt())
			{
			case 1:
				System.out.println("Enter the new Address book name");
				String file=Utility.GetLine();
				addressbook.CreateAddressbook(file);  
				System.out.println("Address book created");
				break;
				
			case 2:
				System.out.println("Enter the exsisting address book name");
				String filename=Utility.GetLine();
				addressbook.ExsistingAddressbook(filename);
				int run=0;
					while(run==0)
					{
					System.out.println("Press Number for Option***********************************");
					System.out.println("press 1 Add person");
					System.out.println("press 2 Remove person");
					System.out.println("press 3 check details");
					System.out.println("press 4 manage details");
					System.out.println("press 5 save");
					System.out.println("press 6 exit");
					switch(Utility.GetInt())
					{
					case 1:
						addressbook.add();
						System.out.println("successfully added");
						break;
					
					case 2:
						System.out.println("Enter the person name to remove the details from address book");
						String name=Utility.GetLine();
						addressbook.remove(name);
						System.out.println("successfully removed");
						break;
					case 3:
						System.out.println("Enter a person name to check his details");
						String checkdetais=Utility.GetLine();
						addressbook.GetDetails(checkdetais);
						break;
					case 4:
						System.out.println("Enter the person name to change details");
						String change=Utility.GetLine();
						if(addressbook.check(change))
						{
						System.out.println("Press Number for Option*********************************************");
						
						System.out.println("press 1 change firstname");
						System.out.println("press 2 change lastname");
						System.out.println("press 3 change city");
						System.out.println("press 4 change address");
						System.out.println("press 5 change state");
						System.out.println("press 6 change zip");
						System.out.println("press 7 change phone Number");
						switch(Utility.GetInt())
						{
						case 1:
							System.out.println("Enter new firstname");
							String firstname=Utility.GetLine();
							addressbook.changingvalue(change,"firstname",firstname);
							break;
						case 2:
							System.out.println("Enter new lastname");
							String lastname=Utility.GetLine();
							addressbook.changingvalue(change,"lastname",lastname);
							break;
						case 3:
							System.out.println("Enter new city");
							String city=Utility.GetLine();
							addressbook.changingvalue(change,"city",city);
							break;
						case 4:
							System.out.println("Enter new address");
							String address=Utility.GetLine();
							addressbook.changingvalue(change,"address",address);
							break;
						case 5:
							System.out.println("Enter new state");
							String state=Utility.GetLine();
							addressbook.changingvalue(change,"state",state);
							break;
						case 6:
							System.out.println("Enter new zip");
							long zip=Utility.Getlong();
							addressbook.changingvalue(change,"zip",zip);
							break;
						case 7:
							System.out.println("Enter new phone number");
							long phone=Utility.Getlong();
							addressbook.changingvalue(change,"phonenumber",phone);
							break;
						default:
							System.out.println("wrong choice");
						}
						}
						break;
					case 5:
						addressbook.save();
						break;
					case 6:
						System.out.println("Bye...........");
						run=1;
						num=0;;
						break;
					}
					}
					break;
			case 3:
				System.out.println("ThankYou!!!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice!!!!!");
             }
		}
		
     }
}
