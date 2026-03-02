package com.user.manage.contact;

import java.util.*;

public class ContactRepository {

    private final Map<UUID, Contact> storage = new HashMap<>();

    public void save(Contact contact) {
        storage.put(contact.getId(), contact);
    }

    public Optional<Contact> findById(UUID id) {
        return Optional.ofNullable(storage.get(id));
    }

    public void hardDelete(UUID id) {
        storage.remove(id);
    }

    public List<Contact> findAllActive() {
        return storage.values().stream()
                .filter(c -> !c.isDeleted())
                .toList();
    }
}