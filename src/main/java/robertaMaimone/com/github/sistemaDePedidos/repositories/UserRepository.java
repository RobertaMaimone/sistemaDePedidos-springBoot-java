package robertaMaimone.com.github.sistemaDePedidos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import robertaMaimone.com.github.sistemaDePedidos.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
