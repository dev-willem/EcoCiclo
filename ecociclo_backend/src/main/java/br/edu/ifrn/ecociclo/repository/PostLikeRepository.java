package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.PostLike;
import br.edu.ifrn.ecociclo.model.PostLikeId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
    void deleteById(PostLikeId id);

    Optional<PostLikeId> findById(PostLikeId id);
}
