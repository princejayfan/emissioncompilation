package com.jay.emissioncompilation.dao;

import com.jay.emissioncompilation.entity.shiro.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jay
 * @Version 1.0
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
