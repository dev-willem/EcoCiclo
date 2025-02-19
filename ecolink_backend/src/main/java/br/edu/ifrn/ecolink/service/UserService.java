package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void signUp(String username, String password, String email, String CpfCnpj) {
        User user = new User();
        user.setUsername(username);
        user.setPasswordHash(password);
        user.setEmail(email);
        user.setCpfCnpj(CpfCnpj);
        repository.save(user);
    }

    public List<User> allUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserDetails(Long id) {
        return repository.findById(id);
    }
}
