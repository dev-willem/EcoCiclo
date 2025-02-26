package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.PostLike;
import br.edu.ifrn.ecolink.model.PostLikeId;
import br.edu.ifrn.ecolink.repository.PostLikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostLikeService {
    @Autowired
    PostLikeRepository repository;

    private PostLike save(PostLike postLike) {
        return repository.save(postLike);
    }

    private void deleteById(PostLikeId id) {
        repository.deleteById(id);
    }

    private List<PostLike> findAll() {
        return repository.findAll();
    }

    private Optional<PostLikeId> findById(PostLikeId id) {
        return repository.findById(id);
    }

    public Long countByPost(Post post) {
    }
}
