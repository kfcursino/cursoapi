package br.com.karina.api.services;

import br.com.karina.api.domain.Users;
import br.com.karina.api.domain.dto.UsersDTO;

import java.util.List;

public interface UserService {

    public Users findById(Integer id);

    List<Users> findAll();

    Users create(UsersDTO obj);

    Users update(UsersDTO obj);

    void delete(Integer id);
}
