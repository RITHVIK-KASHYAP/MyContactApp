package com.user.main;

import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;
import com.user.specifications.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PersonContact> contacts = List.of(
                new PersonContact("Alice"),
                new PersonContact("Bob"),
                new PersonContact("Alicia")
        );

        NameSpecification spec = new NameSpecification("ali");

        contacts.stream()
                .filter(spec::isSatisfiedBy)
                .forEach(c -> System.out.println("Matched: " + c.getName()));
    }
}