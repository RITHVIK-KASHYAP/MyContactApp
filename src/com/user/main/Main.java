package com.user.main;

import com.user.auth.*;
import com.user.manage.contact.*;
import com.user.management.*;

import com.user.management.UserRepository;
import com.user.management.UserService;

public class Main {

    public static void main(String[] args) {

        PersonContact contact = new PersonContact("Rishab");

        contact.addPhone(new PhoneNumber("9876543210"));
        contact.addEmail(new EmailAddress("Rishab@example.com"));

        System.out.println("Contact Created:");
        System.out.println("Name: " + contact.getName());
        System.out.println("Type: " + contact.getType());
    }
}