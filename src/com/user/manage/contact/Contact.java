package com.user.manage.contact;


import java.time.LocalDateTime;
import java.util.*;

import javax.swing.text.html.HTML.Tag;

public abstract class Contact {

    private final UUID id;
    private String name;
    private final List<PhoneNumber> phones;
    private final List<EmailAddress> emails;
    private final Set<Tag> tags;

    private boolean deleted;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    protected Contact(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.phones = new ArrayList<>();
        this.emails = new ArrayList<>();
        this.tags = new HashSet<>();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.deleted = false;
    }

    public UUID getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
        touch();
    }

    public void addPhone(PhoneNumber phone) {
        phones.add(phone);
        touch();
    }

    public void addEmail(EmailAddress email) {
        emails.add(email);
        touch();
    }

    public List<PhoneNumber> getPhones() {
        return Collections.unmodifiableList(phones);
    }

    public List<EmailAddress> getEmails() {
        return Collections.unmodifiableList(emails);
    }

    public Set<Tag> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    public void addTag(Tag tag) {
        tags.add(tag);
        touch();
    }

    public void removeTag(Tag tag) {
        tags.remove(tag);
        touch();
    }

    public void softDelete() {
        this.deleted = true;
    }

    public void restore() {
        this.deleted = false;
    }

    public boolean isDeleted() {
        return deleted;
    }

    private void touch() {
        updatedAt = LocalDateTime.now();
    }

    public abstract String getType();
}