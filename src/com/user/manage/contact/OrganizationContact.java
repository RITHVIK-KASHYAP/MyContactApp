package com.user.manage.contact;


public class OrganizationContact extends Contact {

    public OrganizationContact(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "ORGANIZATION";
    }
}