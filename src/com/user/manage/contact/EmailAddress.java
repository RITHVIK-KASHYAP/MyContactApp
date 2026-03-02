package com.user.manage.contact;

import com.user.management.*;

public class EmailAddress {

    private final String value;

    public EmailAddress(String value) {
        if (!EmailValidator.isValid(value)) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}