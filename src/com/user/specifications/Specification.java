package com.user.specifications;

import com.user.manage.contact.Contact;

public interface Specification {
    boolean isSatisfiedBy(Contact contact);
}