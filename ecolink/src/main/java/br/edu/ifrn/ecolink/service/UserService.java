package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> allUsers() {
        return repository.findAll();
    }
}
