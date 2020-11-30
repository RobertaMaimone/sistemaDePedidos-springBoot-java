package robertaMaimone.com.github.sistemaDePedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import robertaMaimone.com.github.sistemaDePedidos.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	

}
