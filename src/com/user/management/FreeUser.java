package com.user.management;

public class FreeUser extends User {

    public FreeUser(String email, String hashedPassword, String fullName) {
        super(email, hashedPassword, fullName);
    }

    @Override
    public String getUserType() {
        return "FREE";
    }
}