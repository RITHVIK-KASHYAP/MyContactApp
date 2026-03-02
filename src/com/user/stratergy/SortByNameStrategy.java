package com.user.stratergy;


import com.user.auth.*;
import com.user.command.manager.*;
import com.user.manage.contact.*;
import com.user.management.*;
import com.user.view.*;
import com.user.specifications.*;
import java.util.List;

public class SortByNameStrategy implements SortStrategy {

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}