package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
