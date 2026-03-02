package com.user.management;

public class PremiumUser extends User {

    public PremiumUser(String email, String hashedPassword, String fullName) {
        super(email, hashedPassword, fullName);
    }

    @Override
    public String getUserType() {
        return "PREMIUM";
    }
}