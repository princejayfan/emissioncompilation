package com.jay.emissioncompilation.dao;


import com.jay.emissioncompilation.entity.shiro.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jay
 * @Version 1.0
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User findByUserId(Integer userId);
}
