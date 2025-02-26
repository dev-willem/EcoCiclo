package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    private Post save(Post post) {
        return repository.save(post);
    }

    private void deleteById(Long id) {
        repository.deleteById(id);
    }

    private List<Post> findAll() {
        return repository.findAll();
    }

    public Optional<Post> findById(Long id) {
        return repository.findById(id);
    }

    private List<Post> allPosts() {
        return repository.findAll();
    }
}
