package com.user.auth;


import java.util.Optional;

import com.user.management.PasswordUtil;
import com.user.management.User;
import com.user.management.UserRepository;

public class BasicAuthService implements AuthenticationService {

    private final UserRepository userRepository;

    public BasicAuthService(UserRepository repository) {
        this.userRepository = repository;
    }

    @Override
    public Optional<User> login(String email, String password) {

        return userRepository.findByEmail(email)
                .filter(user ->
                        user.verifyPassword(PasswordUtil.hash(password)));
    }
}