package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.Usuario;
import br.edu.ifrn.ecolink.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }
}
