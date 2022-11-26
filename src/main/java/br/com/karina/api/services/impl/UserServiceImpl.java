package br.com.karina.api.services.impl;

import br.com.karina.api.domain.Users;
import br.com.karina.api.domain.dto.UsersDTO;
import br.com.karina.api.repositories.UserRepository;
import br.com.karina.api.services.UserService;
import br.com.karina.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Users> findAll() {
        return repository.findAll();
    }

    @Override
    public Users create(UsersDTO obj) {
        return repository.save(mapper.map(obj, Users.class));
    }
}
