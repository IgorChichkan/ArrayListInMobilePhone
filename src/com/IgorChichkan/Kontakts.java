package com.IgorChichkan;

/**
 * Created by igorc on 21.11.2016.
 */
public class Kontakts {
    private String name;
    private String phoneNumber;

    public Kontakts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Kontakts createContact(String name, String phoneNumber){
        return new Kontakts(name, phoneNumber);

    }
}
