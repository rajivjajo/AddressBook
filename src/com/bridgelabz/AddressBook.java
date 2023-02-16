package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    public ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}

