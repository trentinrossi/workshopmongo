package br.com.fullcustom.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fullcustom.workshopmongo.domain.User;
import br.com.fullcustom.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    public UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}