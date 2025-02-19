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

    @PostMapping("/signup")
    public void signUp(@RequestBody User user) {
        service.signUp(user.getUsername(), user.getEmail(), user.getPasswordHash(), user.getCpfCnpj());
    }

    @GetMapping
    public List<User> allUsers() {
        return service.allUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserDetails(@PathVariable Long id) {
        return service.getUserDetails(id);
    }
}
