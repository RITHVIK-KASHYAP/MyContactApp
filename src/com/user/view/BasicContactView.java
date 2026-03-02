package com.user.view;

import com.user.manage.contact.Contact;
 
public class BasicContactView implements ContactView {

    @Override
    public String display(Contact contact) {
        return "Name: " + contact.getName();
    }
}
