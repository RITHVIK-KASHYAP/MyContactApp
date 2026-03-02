/*
 * Problem Domain Overview
MyContacts App is a Java-based, console-driven application implemented use-case wise to demonstrate object-oriented design and core Java concepts through a contact management system.

Features
This application consolidates multiple use cases (UC1 to UC10) into a single, cohesive user experience:

User Management: Registration and Authentication (UC1, UC2).
Profile: Manage personal details, passwords, and preferences (UC3).
Contacts:
Create and Manage Person & Organization contacts (UC4).
View details with Decorator enhancements (UpperCase, Masked Email) (UC5).
Edit contacts with Undo/Redo capabilities (Command Pattern) (UC6).
Delete contacts (Soft & Hard Delete) (UC7).
Groups: Create and manage contact groups with bulk operations (Composite Pattern) (UC8).
Search: Advanced search using Specification Pattern (Name, Phone, Email, Tag, etc.) (UC9).
Filter & Sort: Advanced filtering and sorting options (Strategy Pattern) (UC10).

version: 01
author : Rithvik Kashyap

 * */
package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;

import Tags.*;

import com.user.specifications.*;
import com.user.stratergy.*;
import java.util.List;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Tag tag1 = new Tag("Family");
        Tag tag2 = new Tag("Work");

        System.out.println("Created Tags:");
        System.out.println(tag1.getName());
        System.out.println(tag2.getName());
    }
}