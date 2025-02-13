package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.Postagem;
import br.edu.ifrn.ecolink.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PostagemController {
    @Autowired
    private PostagemRepository repository;

    @PostMapping
    public Postagem criarPostagem(@RequestBody Postagem postagem) {
        return repository.save(postagem);
    }

    @GetMapping
    public List<Postagem> listarPostagens() {
        return repository.findAll();
    }

    @GetMapping("/localizacao/{localizacao}")
    public List<Postagem>
    listarPorLocalozacao(@PathVariable String localizacao) {
        return repository.findByLocalizacao(localizacao);
    }
}
