package com.jay.emissioncompilation.service;



import com.jay.emissioncompilation.entity.shiro.SysToken;
import com.jay.emissioncompilation.entity.shiro.User;

import java.util.Map;

/**
 * @Author Jay
 * @Version 1.0
 */
public interface ShiroService {
     /**
      * Find user by username
      * @param username
      * @return
      */
     User findByUsername(String username);

     /**
      * create token by userId
      * @param userId
      * @return
      */
     Map<String,Object> createToken(Integer userId);

     /**
      * logout
      * @param userId
      */
     void logout(Integer userId);

     /**
      * find token by token
      * @param accessToken
      * @return
      */
     SysToken findByToken(String accessToken);

     /**
      * find user by userId
      * @param userId
      * @return
      */
     User findByUserId(Integer userId);
}
