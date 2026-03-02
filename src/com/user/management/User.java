package com.user.management;

import java.util.UUID;

public abstract class User {

    private final UUID id;
    private String email;
    private String hashedPassword;
    private String fullName;

    protected User(String email, String hashedPassword, String fullName) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.fullName = fullName;
    }

    public UUID getId() { return id; }

    public String getEmail() { return email; }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public boolean verifyPassword(String inputHash) {
        return hashedPassword.equals(inputHash);
    }

    public String getFullName() {
        return fullName;
    }

    public abstract String getUserType();
}