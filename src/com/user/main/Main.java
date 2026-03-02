package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;

public class Main {

    public static void main(String[] args) {

        PersonContact contact = new PersonContact("Rithvik");

        CommandManager manager = new CommandManager();

        UpdateNameCommand cmd = new UpdateNameCommand(contact, "Rithvik Kashyap");

        manager.execute(cmd);
        System.out.println("After Update: " + contact.getName());

        manager.undo();
        System.out.println("After Undo: " + contact.getName());

        manager.redo();
        System.out.println("After Redo: " + contact.getName());
    }
}