package com.user.management;

public class ProfileService {

    public void updateEmail(User user, String newEmail) {
        if (!EmailValidator.isValid(newEmail)) {
            throw new IllegalArgumentException("Invalid email");
        }
        user.setEmail(newEmail);
    }

    public void changePassword(User user, String newPassword) {
        user.setHashedPassword(PasswordUtil.hash(newPassword));
    }
}