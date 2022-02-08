package com.danielradonic;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("15-61050616");

    public static void main(String[] args) {

        boolean quit = false;


        optionList();

        while (!quit) {
            System.out.println("Enter option 0(choices) 6(quit):");
            int choice = 0;

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    optionList();
                    break;
                case 1:
                    mobilePhone.listContacts();
                    break;
                case 2:
                    System.out.print("Enter contact to find: ");
                    mobilePhone.findContact(scanner.nextLine());
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    System.out.print("Enter contact to delete: ");
                    mobilePhone.deleteContact(scanner.nextLine());
                    break;
                case 6:
                    quit = true;
            }
        }

        scanner.close();
    }

    public static void optionList() {
        System.out.println("Options:");
        System.out.println("-------------------");
        System.out.println("0 - List choice options");
        System.out.println("1 - List contacts");
        System.out.println("2 - Find contact");
        System.out.println("3 - Add contact");
        System.out.println("4 - Modify contact");
        System.out.println("5 - Delete contact");
        System.out.println("6 - Quit");
        System.out.println("-------------------");
    }



    public static void addContact(){
        System.out.print("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.print("\nEnter new contact number:");
        int number = scanner.nextInt();
        Contact newContact = Contact.createContact(name, number);
        mobilePhone.addContact(newContact);
    }

    public static void modifyContact(){
        System.out.print("Current contact name:");
        String currentName = scanner.nextLine();
        if (mobilePhone.findContact(currentName)) {
            System.out.print("New contact name:");
            String newName = scanner.nextLine();
            System.out.print("New contact number:");
            int newNumber = scanner.nextInt();
            Contact modifiedContact = Contact.createContact(newName,newNumber);
            mobilePhone.modifyContact(currentName, modifiedContact);
        } else {
            System.out.println("Contact not found");
        }
    }
}
