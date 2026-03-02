package com.user.auth;

import java.util.Optional;

import com.user.management.User;

public class SessionManager {

    private User currentUser;

    public void createSession(User user) {
        this.currentUser = user;
    }

    public void logout() {
        currentUser = null;
    }

    public Optional<User> getCurrentUser() {
        return Optional.ofNullable(currentUser);
    }
}