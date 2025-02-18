package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
