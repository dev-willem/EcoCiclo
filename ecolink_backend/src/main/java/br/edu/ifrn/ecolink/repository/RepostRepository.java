package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Post;
import br.edu.ifrn.ecolink.model.Repost;
import br.edu.ifrn.ecolink.model.RepostId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepostRepository extends JpaRepository<Repost, Long> {
    void deleteById(RepostId id);

    Optional<Repost> findById(RepostId id);

    Long countByPost(Post post);
}
