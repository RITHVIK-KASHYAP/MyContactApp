package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;
import com.user.specifications.*;
import com.user.stratergy.*;
import java.util.List;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<PersonContact> contacts = new ArrayList<>();

        contacts.add(new PersonContact("Rishab"));
        contacts.add(new PersonContact("Rithvik"));
        contacts.add(new PersonContact("Ghoose"));

        contacts.sort(new SortByNameStrategy());

        contacts.forEach(c -> System.out.println(c.getName()));
    }
}