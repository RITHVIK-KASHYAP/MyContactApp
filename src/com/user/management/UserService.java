package com.user.management;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String email,
                         String password,
                         String fullName,
                         String type) {

        if (!EmailValidator.isValid(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        userRepository.findByEmail(email)
                .ifPresent(u -> {
                    throw new UserAlreadyExistsException("Email already registered");
                });

        String hashed = PasswordUtil.hash(password);

        User user = UserFactory.createUser(type, email, hashed, fullName);
        userRepository.save(user);

        return user;
    }
}