package com.user.main;

import com.user.auth.*;
import com.user.management.*;

import com.user.management.UserRepository;
import com.user.management.UserService;

public class Main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();
        UserService service = new UserService(repo);

        service.register("rithvik@7-11.com", "pass123", "Rithvik", "FREE");

        AuthenticationService auth1 = new BasicAuthService(repo);
        SessionManager session = new SessionManager();

        auth1.login("rithvik@7-11.com", "pass123")
                .ifPresentOrElse(
                        user -> {
                            session.createSession(user);
                            System.out.println("Login Successful");
                        },
                        () -> System.out.println("Invalid Credentials")
                );
    }
}