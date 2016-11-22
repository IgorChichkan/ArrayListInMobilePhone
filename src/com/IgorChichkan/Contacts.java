package com.IgorChichkan;

import java.util.ArrayList;

public class Contacts {

    private String myNumber;
    private ArrayList<Kontakts> contactList;

    public Contacts(String myNumber) {
        this.myNumber = myNumber;
        this.contactList=new ArrayList<Kontakts>();

    }

    public boolean addNewContact(Kontakts contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }
    public boolean updateContact(Kontakts oldContact, Kontakts newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition<0){
            System.out.println(oldContact.getName()+" was non found");
            return false;
        }
        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+ " was replaced with "+ newContact.getName());
        return true;
    }

        private int findContact(Kontakts contact){
        return this.contactList.indexOf(contact);
    }

    public boolean removeContact (Kontakts contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was non found");
            return false;
        }
        this.contactList.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;


    }
    private int findContact(String contactName){
        for (int i=0; i<this.contactList.size();i++) {
            Kontakts contact = this.contactList.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;

    }
    public String queryContact(Kontakts contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Kontakts querryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.contactList.get(position);
        }
        return null;

    }
    public void printContacts(){
        System.out.println("Contact list");
        for (int i=0; i<this.contactList.size();i++){
            System.out.println((i+1)+"."+this.contactList.get(i).getName()+"->"+this.contactList.get(i).getPhoneNumber());
        }
    }


    }

//    public ArrayList<Kontakts> getContactList() {
//        return contactList;
//    }
//
//    public void printContacts(){
//        System.out.println("You have "+contactList.size()+" contacts in your contact List");
//        for (int i=0; i<contactList.size(); i++){
//            System.out.println((i+1)+ ". "+contactList.get(i));
//        }
//    }
//
//    public void addNewContact(String contact){
//        contactList.add(contact);
//    }
//    private int findContact(String searchContact){
//        return contactList.indexOf(searchContact);
//    }
//    private void updateContact(int position, String newContact){
//        contactList.set(position, newContact);
//        System.out.println("Contact  "+ (position+1)+ " has been modified.");
//    }
//
//    public void updateContact(String currentContact, String newContact){
//        int position = contactList.indexOf(currentContact);
//        if(position>=0){
//            updateContact(position, newContact);
//        }
//
//
//    }
//    private void removeContact(int positon){
//        contactList.remove(positon);
//    }
//    public void removeContact(String item) {
//        int position = findContact(item);
//        if (position >= 0) {
//            removeContact(position);
//        }
//    }
//    public boolean onContact(String searchItem) {
//        int position = findContact(searchItem);
//        if (position >= 0) {
//            return true;
//        }
//        return false;
//    }






