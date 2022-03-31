package com.brightology.jwtdemo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AuthenticationResponseTest {
    @Test
    void testConstructor() {
        assertEquals("Jwt", (new AuthenticationResponse("Jwt")).getJwt());
    }
}

