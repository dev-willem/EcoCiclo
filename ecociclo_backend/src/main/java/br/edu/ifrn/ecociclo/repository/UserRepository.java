package br.edu.ifrn.ecociclo.repository;

import br.edu.ifrn.ecociclo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
