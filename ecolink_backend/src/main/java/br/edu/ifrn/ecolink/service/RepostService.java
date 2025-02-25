package br.edu.ifrn.ecolink.service;

import br.edu.ifrn.ecolink.model.Repost;
import br.edu.ifrn.ecolink.model.RepostId;
import br.edu.ifrn.ecolink.repository.RepostRepository;
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
}
