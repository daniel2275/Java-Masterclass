package com.danielradonic;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        int foundContact = findContact(contact.getName());
        if (foundContact < 0) {
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundIndex = findContact(oldContact);
        if (foundIndex < 0) {
            return false;
        } else if (findContact(newContact) != -1 && findContact(newContact) != foundIndex)  {
            return false;
        }

        this.myContacts.set(foundIndex,newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundIndex = findContact(contact);
        if (foundIndex < 0) {
            return false;
        }

        this.myContacts.remove(foundIndex);
        return true;
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i = 0; i < this.myContacts.size() ; i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
               return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        return this.myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }
}

