package com.bridgelabz.addressbook;

import com.bridgelabz.addressbook.contactdata.DataBase;
import com.bridgelabz.addressbook.service.AddressBookService;
import com.bridgelabz.addressbook.utils.PrintUtils;
/*
* @author ROSHNI
* Address Book System Service
* */

public class Main {

    // Main Method
    public static void main(String[] args) {
        System.out.println("*********************************************************");
        System.out.println("**********Welcome to Address Book System Service*********");
        System.out.println("*********************************************************");
        /* UC-1 */
        // Add Contact to the Address Book
        AddressBookDTO addressBookDTO = new AddressBookDTO("Roshni", "Mali", "Mahavir Pura", "Udaipur",
                "Rajasthan", "10043", "9998887776", "roshni@123");
        AddressBookService addressBookService = new AddressBookService();
        addressBookService.addData(addressBookDTO);
        PrintUtils.print(DataBase.dtoMap);
    }
}
