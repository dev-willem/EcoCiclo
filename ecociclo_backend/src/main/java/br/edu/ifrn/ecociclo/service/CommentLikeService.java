package br.edu.ifrn.ecociclo.service;

import br.edu.ifrn.ecociclo.model.CommentLike;
import br.edu.ifrn.ecociclo.model.CommentLikeId;
import br.edu.ifrn.ecociclo.model.Post;
import br.edu.ifrn.ecociclo.repository.CommentLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentLikeService {
    @Autowired
    CommentLikeRepository repository;

    public CommentLike save(CommentLike commentLike) {
        return repository.save(commentLike);
    }

    public void deleteById(CommentLikeId id) {
        repository.deleteById(id);
    }

    public List<CommentLike> findAll() {
        return repository.findAll();
    }

    public Optional<CommentLike> findById(CommentLikeId id) {
        return repository.findById(id);
    }

    public Long countByPost(Post post) {
        return repository.countByPost(post);
    }
}
