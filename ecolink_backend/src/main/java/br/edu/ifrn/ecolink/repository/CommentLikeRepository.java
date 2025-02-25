package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.CommentLike;
import br.edu.ifrn.ecolink.model.CommentLikeId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    void deleteById(CommentLikeId id);

    Optional<CommentLike> findById(CommentLikeId id);
}
