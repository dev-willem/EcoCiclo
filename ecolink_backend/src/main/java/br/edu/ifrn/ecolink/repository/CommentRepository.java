package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Comment;
import br.edu.ifrn.ecolink.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Long countByPost(Post post);
}
