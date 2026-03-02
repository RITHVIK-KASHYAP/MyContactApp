package com.user.auth;

import java.util.Optional;

import com.user.management.User;

public interface AuthenticationService {
    Optional<User> login(String email, String password);
}