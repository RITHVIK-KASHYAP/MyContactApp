package com.user.command.manager;

import com.user.manage.contact.Contact;

public class UpdateNameCommand implements command {

    private final Contact contact;
    private final String newName;
    private String oldName;

    public UpdateNameCommand(Contact contact, String newName) {
        this.contact = contact;
        this.newName = newName;
    }

    @Override
    public void execute() {
        oldName = contact.getName();
        contact.setName(newName);
    }

    @Override
    public void undo() {
        contact.setName(oldName);
    }
}