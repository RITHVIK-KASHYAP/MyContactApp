package com.user.view;

import com.user.manage.contact.Contact;

public class MaskEmailDecorator extends ContactViewDecorator {

    public MaskEmailDecorator(ContactView wrapped) {
        super(wrapped);
    }

    @Override
    public String display(Contact contact) {

        String base = wrapped.display(contact);

        if (!contact.getEmails().isEmpty()) {
            String email = contact.getEmails().get(0).getValue();
            String masked = email.replaceAll("(^.).*(@.*$)", "$1****$2");
            base += "\nEmail: " + masked;
        }

        return base;
    }
}
