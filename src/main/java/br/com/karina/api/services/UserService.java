package br.com.karina.api.services;

import br.com.karina.api.domain.Users;

public interface UserService {

    public Users findById(Integer id);
}
