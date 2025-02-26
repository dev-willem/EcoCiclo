package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.Post;
import br.edu.ifrn.ecociclo.model.Repost;
import br.edu.ifrn.ecociclo.model.RepostId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepostRepository extends JpaRepository<Repost, Long> {
    void deleteById(RepostId id);

    Optional<Repost> findById(RepostId id);

    Long countByPost(Post post);
}
