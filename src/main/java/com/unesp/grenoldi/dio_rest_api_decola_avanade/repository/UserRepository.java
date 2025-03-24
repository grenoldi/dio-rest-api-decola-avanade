package com.unesp.grenoldi.dio_rest_api_decola_avanade.repository;

import com.unesp.grenoldi.dio_rest_api_decola_avanade.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
