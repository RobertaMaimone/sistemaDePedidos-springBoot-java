package robertaMaimone.com.github.sistemaDePedidos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import robertaMaimone.com.github.sistemaDePedidos.entities.Product;
import robertaMaimone.com.github.sistemaDePedidos.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = productService.getAllProducts();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> getById(@PathVariable Long id){
		Product productId = productService.getById(id);
		return ResponseEntity.ok().body(productId);
		
	}

}
