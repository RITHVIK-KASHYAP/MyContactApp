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