package robertaMaimone.com.github.sistemaDePedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robertaMaimone.com.github.sistemaDePedidos.entities.Category;
import robertaMaimone.com.github.sistemaDePedidos.entities.Order;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	

}
