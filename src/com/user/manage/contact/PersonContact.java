package com.user.manage.contact;


public class PersonContact extends Contact {

    public PersonContact(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "PERSON";
    }
}