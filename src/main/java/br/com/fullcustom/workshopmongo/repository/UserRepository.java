package br.com.fullcustom.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fullcustom.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    
}