package br.edu.ifrn.ecociclo.service;

import br.edu.ifrn.ecociclo.model.Post;
import br.edu.ifrn.ecociclo.model.Repost;
import br.edu.ifrn.ecociclo.model.RepostId;
import br.edu.ifrn.ecociclo.repository.RepostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepostService {
    @Autowired
    RepostRepository repository;

    private Repost save(Repost retweet) {
        return repository.save(retweet);
    }

    private void deleteById(RepostId id) {
        repository.deleteById(id);
    }

    private List<Repost> findAll() {
        return repository.findAll();
    }

    private Optional<Repost> findById(RepostId id) {
        return repository.findById(id);
    }

    public Long countByPost(Post post) {
        return repository.countByPost(post);
    }
}
