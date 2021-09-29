package com.supremecorp.login;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by suprememajor on 9/29/21
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/login")
    public User addUsers(@RequestBody User user) {
        return userRepository.save(user);
    }
}
