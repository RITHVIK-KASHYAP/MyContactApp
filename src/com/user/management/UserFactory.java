package com.user.management;

public class UserFactory {

    public static User createUser(String type, String email,
                                  String hashedPassword,
                                  String fullName) {

        return switch (type.toUpperCase()) {
            case "FREE" -> new FreeUser(email, hashedPassword, fullName);
            case "PREMIUM" -> new PremiumUser(email, hashedPassword, fullName);
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}