package com.user.main;

import com.user.auth.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;
import com.user.management.UserRepository;
import com.user.management.UserService;

public class Main {

    public static void main(String[] args) {

        PersonContact contact = new PersonContact("Rithvik");
        contact.addEmail(new EmailAddress("Rithvik@example.com"));

        ContactView view = new BasicContactView();
        view = new MaskEmailDecorator(view);
        view = new UpperCaseDecorator(view);

        System.out.println(view.display(contact));
    }
}