package br.com.fullcustom.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fullcustom.workshopmongo.domain.User;
import br.com.fullcustom.workshopmongo.dto.UserDTO;
import br.com.fullcustom.workshopmongo.repository.UserRepository;
import br.com.fullcustom.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    public UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
		return repository.insert(obj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}

}