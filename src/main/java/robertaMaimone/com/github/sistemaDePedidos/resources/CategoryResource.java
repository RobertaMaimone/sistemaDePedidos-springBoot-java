package robertaMaimone.com.github.sistemaDePedidos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import robertaMaimone.com.github.sistemaDePedidos.entities.Category;
import robertaMaimone.com.github.sistemaDePedidos.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> getAllCategorys(){
		List<Category> list = categoryService.getAllCategorys();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> getById(@PathVariable Long id){
		Category userId = categoryService.getById(id);
		return ResponseEntity.ok().body(userId);
		
	}

}
