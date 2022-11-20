package br.com.karina.api.config;

import br.com.karina.api.domain.Users;
import br.com.karina.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        Users u1 = new Users(null, "Karina", "karina@mail.com", "123");
        Users u2 = new Users(null, "Joao", "joao@mail.com", "123");
        Users u3 = new Users(null, "Miguel", "miguel@mail.com", "123");

        repository.saveAll(List.of(u1, u2, u3));
    }
}
