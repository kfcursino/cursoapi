package br.com.karina.api.services;

import br.com.karina.api.domain.Users;

import java.util.List;

public interface UserService {

    public Users findById(Integer id);

    List<Users> findAll();
}
