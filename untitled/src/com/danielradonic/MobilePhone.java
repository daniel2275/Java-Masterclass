package com.danielradonic;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;


    public MobilePhone(String myNumber) {
        this.contacts = new ArrayList<Contact>();
    }



    public void listContacts(){
        System.out.println("You have " + contacts.size() + " contacts in your address book");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.print("Name: " + contacts.get(i).getName() + " Number: ");
            System.out.println(contacts.get(i).getNumber());
        }
    }

    private int findIndex(String name) {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

//    private Contact queryContact(String name) {
//        int index = (findIndex(name));
//        if (index < 0){
//            return this.contacts.get(index);
//        }
//        return null;
//    }

    private boolean checkItem(Contact contact) {
        if (contacts.contains(contact)) {
            System.out.println("There is already a contact with name " + contact.getName() + " on the mobile");
            return false;
        }
        return true ;
    }

    public void addContact(Contact contact){
        if (checkItem(contact)) {
            contacts.add(contact);
        }
    }

    public void modifyContact(String name, Contact newContact){
        if (checkItem(newContact)) {
            int index = findIndex(name);
            if (index > -1) {
                this.contacts.set(index, newContact);
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    public boolean findContact(String name){
        int index = findIndex(name);
        if (index > -1) {
            System.out.println("Found contact " + this.contacts.get(index).getName() + " Number: " + this.contacts.get(index).getNumber() + " at index: " + index);
            return true;
        } else {
            System.out.println("Contact not found");
            return false;
        }
    }

    public void deleteContact(String name){
        int foundIndex = findIndex(name);
        if (foundIndex > -1) {
            System.out.println("Deleting contact " + this.contacts.get(foundIndex).getName() + " at index: " + foundIndex);
            contacts.remove(contacts.get(foundIndex));
        } else {
            System.out.println("Contact not found");
        }
    }
}
