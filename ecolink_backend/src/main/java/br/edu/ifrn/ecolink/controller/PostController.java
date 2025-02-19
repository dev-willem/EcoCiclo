package br.edu.ifrn.ecolink.controller;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.User;
import br.edu.ifrn.ecolink.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService service;

    @PostMapping
    public Post newPost(@RequestBody Post post) {
        return service.newPost(post);
    }

    @GetMapping
    public List<Post> allPosts() {
        return service.allPosts();
    }

}
