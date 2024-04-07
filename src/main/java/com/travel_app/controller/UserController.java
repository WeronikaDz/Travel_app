package com.travel_app.controller;

import com.travel_app.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    private static final List<User> USERS = Arrays.asList(
            new User(1, "Adam Małysz"),
            new User(2, "Britney Spears"),
            new User(3, "Anna Smith")
    );


}
