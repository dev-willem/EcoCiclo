package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<User> listarUsuarios() {
        return service.allUsers();
    }
}
