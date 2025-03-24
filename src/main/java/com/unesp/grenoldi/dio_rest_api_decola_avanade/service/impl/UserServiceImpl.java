package com.unesp.grenoldi.dio_rest_api_decola_avanade.service.impl;

import com.unesp.grenoldi.dio_rest_api_decola_avanade.model.User;
import com.unesp.grenoldi.dio_rest_api_decola_avanade.repository.UserRepository;
import com.unesp.grenoldi.dio_rest_api_decola_avanade.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long Id) {
        return userRepository.findById(Id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User userToCreate) {
        if(userToCreate.getId() != 0 && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user ID already exists");
        }
        return this.userRepository.save(userToCreate);
    }
}
