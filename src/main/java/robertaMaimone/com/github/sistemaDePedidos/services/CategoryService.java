package robertaMaimone.com.github.sistemaDePedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import robertaMaimone.com.github.sistemaDePedidos.entities.Category;
import robertaMaimone.com.github.sistemaDePedidos.repositories.CategoryRepository;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> getAllCategorys(){
		return CategoryRepository.findAll();
	}
	
	public Category getById(Long id) {
		Optional<Category> CategoryId = CategoryRepository.findById(id);
		return CategoryId.get();
	}

}
