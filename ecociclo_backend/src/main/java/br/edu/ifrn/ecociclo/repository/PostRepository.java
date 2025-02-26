package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
