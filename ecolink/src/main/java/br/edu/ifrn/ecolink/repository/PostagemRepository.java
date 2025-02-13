package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    List<Postagem> findByLocalizacao(String localizacao);
}
