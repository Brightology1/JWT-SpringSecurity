package com.brightology.jwtdemo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {JwtUtil.class})
@ExtendWith(SpringExtension.class)
class JwtUtilTest {
    @Autowired
    private JwtUtil jwtUtil;

    @Test
    void testGenerateToken() {
        assertEquals(
                "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqYW5lZG9lIiwiZXhwIjoxNjQzNjI3NDAyLCJpYXQiOjE2NDM1OTE0MDJ9.NFT4CLPOAJKIfy"
                        + "_T308mv-gKAZo1qV7bJYMJph96FZQ",
                this.jwtUtil.generateToken(new User("janedoe", "iloveyou", new ArrayList<>())));
        assertEquals(
                "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJVc2VybmFtZSIsImV4cCI6MTY0MzYyNzQwMiwiaWF0IjoxNjQzNTkxNDAyfQ"
                        + ".oHzSWy6N6FIaMTuLeJYydrNVGV0qt2YKfu4ciSq-yHY",
                this.jwtUtil.generateToken(new User("Username", "iloveyou", new ArrayList<>())));
    }
}

