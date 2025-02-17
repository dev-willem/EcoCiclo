package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping
    public List<User> listUsers() {
        return service.allUsers();
    }

    @GetMapping
    public Optional<User> getUserDetails(@RequestBody Long id) {
        return service.getUserDetails(id);
    }
}
