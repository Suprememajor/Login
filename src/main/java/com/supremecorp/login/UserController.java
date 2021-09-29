package com.supremecorp.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        return new ArrayList<>(List.of(new User[]{
                new User("A", "A"),
                new User("B", "B"),
                new User("C", "C")
        }));
    }

    @PostMapping("/login")
    public Token addUsers(@RequestBody User user) {
        return new Token("fedfbafdfasdfjbdasfasdfadf", "djfdofbdskjfbbdksfbdsf");
    }
}
@Getter
@AllArgsConstructor
class Token {
    private String access_token;
    private String refresh_token;
}
