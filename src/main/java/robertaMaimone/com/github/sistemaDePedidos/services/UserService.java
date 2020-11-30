package robertaMaimone.com.github.sistemaDePedidos.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import robertaMaimone.com.github.sistemaDePedidos.entities.User;
import robertaMaimone.com.github.sistemaDePedidos.repositories.UserRepository;
import robertaMaimone.com.github.sistemaDePedidos.services.exceptions.DatabaseException;
import robertaMaimone.com.github.sistemaDePedidos.services.exceptions.ResourceNotFoundException;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public User getById(Long id) {
		Optional<User> userId = userRepository.findById(id);
		return userId.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insertUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
	    try {	
	    	userRepository.deleteById(id);
	    } catch (EmptyResultDataAccessException e) {
			 throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User updateUser(Long id, User user) {
		try {
			User entity = userRepository.getOne(id);
			updateData(entity, user);
			return userRepository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
		
		
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		
	}

}
