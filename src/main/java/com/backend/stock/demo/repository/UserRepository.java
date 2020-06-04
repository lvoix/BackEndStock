package com.backend.stock.demo.repository;

import com.backend.stock.demo.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Long>{

    user findByusername(String username);
    user findBypassword(String password);
}
