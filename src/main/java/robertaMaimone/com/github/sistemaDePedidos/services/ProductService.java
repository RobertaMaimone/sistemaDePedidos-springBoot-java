package robertaMaimone.com.github.sistemaDePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import robertaMaimone.com.github.sistemaDePedidos.entities.Product;
import robertaMaimone.com.github.sistemaDePedidos.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getById(Long id) {
		Optional<Product> userId = productRepository.findById(id);
		return userId.get();
	}

}
