package com.user.main;

import com.user.auth.*;
import com.user.management.*;

import com.user.management.UserRepository;
import com.user.management.UserService;

public class Main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();
        UserService userService = new UserService(repo);
        ProfileService profileService = new ProfileService();

        User user = userService.register(
                "rithvik@7-11.com",
                "pass123",
                "Rithvik",
                "FREE"
        );

        profileService.changePassword(user, "NewPass456");
        profileService.updateEmail(user, "rithvik.new@7-11.com");

        System.out.println("Updated Email: " + user.getEmail());
    }
}