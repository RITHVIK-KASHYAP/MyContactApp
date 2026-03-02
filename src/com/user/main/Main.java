package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;

public class Main{

    public static void main(String[] args) {

        ContactGroup group = new ContactGroup("Friends");

        PersonContact c1 = new PersonContact("Rithvik");
        PersonContact c2 = new PersonContact("Rishab");

        group.add(c1);
        group.add(c2);

        group.deleteAll();

        System.out.println("Bulk Soft Delete Applied");
    }
}