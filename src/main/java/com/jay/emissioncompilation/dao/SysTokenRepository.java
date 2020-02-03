package com.jay.emissioncompilation.dao;

import com.jay.emissioncompilation.entity.shiro.SysToken;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Jay
 * @Version 1.0
 */

public interface SysTokenRepository extends JpaRepository<SysToken, Integer> {
    SysToken findByToken(String accessToken);

    SysToken findByUserId(Integer userId);
}
