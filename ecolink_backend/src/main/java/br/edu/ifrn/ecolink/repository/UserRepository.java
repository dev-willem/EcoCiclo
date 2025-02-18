package br.edu.ifrn.ecolink.repository;

import br.edu.ifrn.ecolink.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
