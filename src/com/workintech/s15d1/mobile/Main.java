package com.workintech.s15d1.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("121212");
        Contact cihat = new Contact("Cihat", "121213"))
        phone.addNewContact(cihat);
        phone.addNewContact(new Contact("Ali", "121212"));
        phone.addNewContact(new Contact("Ciha", "121214"));
        phone.addNewContact(new Contact("Cih", "121216"));
        phone.addNewContact(new Contact("Ci", "121217"));
        phone.printContact();
    }
}
