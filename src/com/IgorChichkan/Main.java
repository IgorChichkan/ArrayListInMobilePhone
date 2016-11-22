package com.IgorChichkan;
import java.util.Scanner;
public class Main {


   private static Scanner scanner = new Scanner(System.in);
    private static Contacts mobilePhone = new Contacts("0038 3232 32");
//    private static Contacts contactList = new Contacts();
//
//
  public static void main(String[] args) {

      boolean quit = false;
      startPhone();
      printActions();
      while (!quit){
          System.out.println("\nEnter action: (6 to show available actions)");
          int action = scanner.nextInt();
          scanner.nextLine();

          switch (action){
              case 0:
                  System.out.println("\nShitting down...");
                  quit = true;
                  break;
              case 1:
                  mobilePhone.printContacts();
                  break;
              case 2:
                  addNewContact();
                  break;
              case 3:
                  updateContact();
                  break;
              case 4:
                  removeContact();
                  break;
              case 5:
                  queryContact();
                  break;
              case 6:
                  printActions();
                  break;


          }



      }


  }
  private static void addNewContact(){
      System.out.println("Enter new contact name: ");
      String name = scanner.nextLine();
      System.out.println("Enter phone number");
      String phone = scanner.nextLine();
      Kontakts newContact = Kontakts.createContact(name, phone);
      if(mobilePhone.addNewContact(newContact)){
          System.out.println("New contact added: "+name+" phone "+phone);
      }else{
          System.out.println("Cannot add, "+ name + "already on file");
      }

  }
  private static void updateContact(){
      System.out.println("Enter existing contact name: ");
      String name = scanner.nextLine();
      Kontakts existingContactRecord = mobilePhone.querryContact(name);
      if(existingContactRecord==null){
          System.out.println("Contact not found");
          return;
      }
      System.out.println("Enter new contact name");
      String newName = scanner.nextLine();
      System.out.println("Enter new contact phone number");
      String newNumber = scanner.nextLine();
      Kontakts newContact = Kontakts.createContact(newName, newNumber);
      if (mobilePhone.updateContact(existingContactRecord, newContact)){
          System.out.println("Successfully updated record");
      }else{
          System.out.println("Error updating record");
      }

  }
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Kontakts existingContactRecord = mobilePhone.querryContact(name);
        if(existingContactRecord==null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Kontakts existingContactRecord = mobilePhone.querryContact(name);
        if(existingContactRecord==null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+ existingContactRecord.getName()+ " phone number is"+existingContactRecord.getPhoneNumber());

    }


    private static void printContacts(){
      mobilePhone.printContacts();
  }
  private static void startPhone(){
      System.out.println("Starting phone...");
  }
  private static void printActions(){

      System.out.println("\nAvailable actions:\npress");
      System.out.println("0 - to shutdown\n"+
              "1 - to print contacts\n"+
              "2 - to add a new contact\n"+
              "3 - to update an existing contact\n"+
              "4 to remove an existing contact\n"+
              "5 - query if an existing contact exists\n"+
              "6 - to print a list of available actions.");
      System.out.println("Choose your action");

  }
  }
//
//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while (!quit) {
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    contactList.printContacts();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForitem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//
//            }
//        }
//    }
//
//    public static void printInstructions() {
//        System.out.println("\nPress");
//        System.out.println("\t 0 - To print choice options");
//        System.out.println("\t 1 - To print the list of contacts");
//        System.out.println("\t 2 - To add an contact to the list");
//        System.out.println("\t 3 - To modify a contact in the list");
//        System.out.println("\t 4 - To remove a contact form the list");
//        System.out.println("\t 5 - To search for a contact in the list");
//        System.out.println("\t 6 - To quit the contact list");
//
//    }
//
//    public static void addItem() {
//        System.out.print("Please enter the grocery item: ");
//        contactList.addNewContact(scanner.nextLine());
//    }
//
//    public static void modifyItem() {
//        System.out.print("Current contact: ");
//        String contact = scanner.nextLine();
//        System.out.print("Enter replacement contact: ");
//        String newContact = scanner.nextLine();
//        contactList.updateContact(contact, newContact);
//    }
//
//    public static void removeItem() {
//        System.out.print("Enter contact: ");
//        String itemNo = scanner.nextLine();
//        contactList.removeContact((itemNo));
//
//    }
//
//    public static void searchForitem() {
//        System.out.print("Contact to search for: ");
//        String searchItem = scanner.nextLine();
//        if (contactList.onContact(searchItem)) {
//            System.out.println("Found " + searchItem + " in our grocery list");
//        } else {
//            System.out.println(searchItem + " is not in the shopping list");
//        }
//    }
//}

