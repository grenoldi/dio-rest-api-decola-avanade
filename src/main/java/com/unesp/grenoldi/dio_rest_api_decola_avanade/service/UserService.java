package com.unesp.grenoldi.dio_rest_api_decola_avanade.service;

import com.unesp.grenoldi.dio_rest_api_decola_avanade.model.User;


public interface UserService {
    User findById(Long Id);
    User createUser(User userToCreate);
}
