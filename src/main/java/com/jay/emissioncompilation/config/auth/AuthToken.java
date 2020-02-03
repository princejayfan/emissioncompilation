package com.jay.emissioncompilation.config.auth;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @Author Jay
 * @Version 1.0
 */
public class AuthToken extends UsernamePasswordToken {

    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
