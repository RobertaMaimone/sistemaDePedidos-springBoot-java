package robertaMaimone.com.github.sistemaDePedidos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import robertaMaimone.com.github.sistemaDePedidos.entities.Order;
import robertaMaimone.com.github.sistemaDePedidos.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders(){
		List<Order> list = orderService.getAllOrders();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> getById(@PathVariable Long id){
		Order orderId = orderService.getById(id);
		return ResponseEntity.ok().body(orderId);
		
	}

}
