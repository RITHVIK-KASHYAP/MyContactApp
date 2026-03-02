package com.user.manage.contact;


import java.util.ArrayList;
import java.util.List;

public class ContactGroup {

    private final String name;
    private final List<Contact> members = new ArrayList<>();

    public ContactGroup(String name) {
        this.name = name;
    }

    public void add(Contact contact) {
        members.add(contact);
    }

    public void remove(Contact contact) {
        members.remove(contact);
    }

    public void deleteAll() {
        members.forEach(Contact::softDelete);
    }

    public List<Contact> getMembers() {
        return List.copyOf(members);
    }
}