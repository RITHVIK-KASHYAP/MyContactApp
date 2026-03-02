package com.user.specifications;

import com.user.manage.contact.Contact;

public class NameSpecification implements Specification {

    private final String keyword;

    public NameSpecification(String keyword) {
        this.keyword = keyword.toLowerCase();
    }

    @Override
    public boolean isSatisfiedBy(Contact contact) {
        return contact.getName().toLowerCase().contains(keyword);
    }
}