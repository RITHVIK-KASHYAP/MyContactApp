package com.user.management;

public class UC01_UserRegistration {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user = service.register(
                "john@example.com",
                "SecurePass123",
                "John Doe",
                "FREE"
        );

        System.out.println("Registered User: " + user.getEmail());
        System.out.println("Type: " + user.getUserType());
    }
}