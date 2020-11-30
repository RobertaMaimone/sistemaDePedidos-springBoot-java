package robertaMaimone.com.github.sistemaDePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import robertaMaimone.com.github.sistemaDePedidos.entities.Order;
import robertaMaimone.com.github.sistemaDePedidos.repositories.OrderRepository;



@Service
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> getAllOrders(){
		return OrderRepository.findAll();
	}
	
	public Order getById(Long id) {
		Optional<Order> OrderId = OrderRepository.findById(id);
		return OrderId.get();
	}

}
