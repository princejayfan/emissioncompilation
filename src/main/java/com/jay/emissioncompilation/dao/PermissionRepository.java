package com.jay.emissioncompilation.dao;

import com.jay.emissioncompilation.entity.shiro.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jay
 * @Version 1.0
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
