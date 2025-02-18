package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post newPost(Post post) {
        return repository.save(post);
    }

    public List<Post> allPosts() {
        return repository.findAll();
    }
}
