package br.com.karina.api.resources;

import br.com.karina.api.domain.Users;
import br.com.karina.api.domain.dto.UsersDTO;
import br.com.karina.api.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserResourceTest {
    public static final Integer ID      = 1;
    public static final String NAME     = "Karina";
    public static final String EMAIL    = "karina@mail.com";
    public static final String PASSWORD = "123";
    public static final String OBJETO_NAO_ENCONTRADO = "Objeto não encontrado";
    public static final int INDEX = 0;
    public static final String EMAIL_JA_CADASTRADO_NO_SISTEMA = "E-mail já cadastrado no sistema";

    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper model;

    private Users user;
    private UsersDTO userDTO;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        starUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void starUser() {
        user = new Users(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UsersDTO(ID, NAME, EMAIL, PASSWORD);
    }
}