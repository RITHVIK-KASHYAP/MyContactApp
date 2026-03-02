package com.user.view;

import com.user.manage.contact.Contact;

public class UpperCaseDecorator extends ContactViewDecorator {

    public UpperCaseDecorator(ContactView wrapped) {
        super(wrapped);
    }

    @Override
    public String display(Contact contact) {
        return wrapped.display(contact).toUpperCase();
    }
}
