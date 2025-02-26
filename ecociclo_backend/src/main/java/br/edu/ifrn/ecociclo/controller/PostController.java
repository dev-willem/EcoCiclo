package br.edu.ifrn.ecociclo.controller;

import br.edu.ifrn.ecociclo.dto.PostDTO;
import br.edu.ifrn.ecociclo.mapper.PostMapper;
import br.edu.ifrn.ecociclo.model.Post;
import br.edu.ifrn.ecociclo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;
    @Autowired
    private PostMapper postMapper;

    @PostMapping
    public ResponseEntity<PostDTO> createTweet(@RequestBody Post post) {
        return ResponseEntity.ok(postMapper.toDTO(postService.save(post)));
    }

    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllTweet() {
        return ResponseEntity.ok(postService.findAll()
                .stream()
                .map(postMapper::toDTO)
                .toList()
        );
    }
}
