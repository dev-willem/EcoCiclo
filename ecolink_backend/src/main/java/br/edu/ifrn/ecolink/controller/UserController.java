package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/signup")
    public ResponseEntity<User> sign(@RequestBody User user) {
        return ResponseEntity.ok(service.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public Optional<User> getUserDetails(@PathVariable Long id) {
            return service.findById(id);
    }
}
