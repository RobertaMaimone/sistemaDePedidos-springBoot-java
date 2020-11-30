package robertaMaimone.com.github.sistemaDePedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robertaMaimone.com.github.sistemaDePedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	

}
