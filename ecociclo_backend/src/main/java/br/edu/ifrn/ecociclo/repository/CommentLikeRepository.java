package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.CommentLike;
import br.edu.ifrn.ecociclo.model.CommentLikeId;
import br.edu.ifrn.ecociclo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    void deleteById(CommentLikeId id);

    Optional<CommentLike> findById(CommentLikeId id);

    Long countByPost(Post post);
}
