package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;

public class Main {

    public static void main(String[] args) {

        ContactRepository repo = new ContactRepository();

        PersonContact contact = new PersonContact("Rishab");
        repo.save(contact);

        contact.softDelete();
        System.out.println("Soft Deleted: " + contact.isDeleted());

        repo.hardDelete(contact.getId());
        System.out.println("Hard Delete Completed");
    }
}