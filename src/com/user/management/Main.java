package com.user.management;

public class Main {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        User user = service.register(
                "Rithvik@7-11.com",
                "SecurePass123",
                "Rithvik K",
                "FREE"
        );

        System.out.println("Registered User: " + user.getEmail());
        System.out.println("Type: " + user.getUserType());
    }
}