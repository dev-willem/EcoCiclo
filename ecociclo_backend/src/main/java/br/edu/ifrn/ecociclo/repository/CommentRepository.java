package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.Comment;
import br.edu.ifrn.ecociclo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Long countByPost(Post post);
}
