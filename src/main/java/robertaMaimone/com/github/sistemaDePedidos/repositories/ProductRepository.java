package robertaMaimone.com.github.sistemaDePedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robertaMaimone.com.github.sistemaDePedidos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	

}
