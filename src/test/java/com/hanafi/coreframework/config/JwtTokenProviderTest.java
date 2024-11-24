package com.hanafi.coreframework.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.Authentication;
import org.springframework.test.util.ReflectionTestUtils;

@ExtendWith(MockitoExtension.class)
class JwtTokenProviderTest {

    private JwtTokenProvider jwtTokenProvider;

    @BeforeEach
    void setup() {
        jwtTokenProvider = new JwtTokenProvider();
        ReflectionTestUtils.setField(jwtTokenProvider, "jwtSecret", "zE6xz/1DC/pvo/+t2d/RWub/61t+5MH/nH2Xtt6JRqFvC4=/e+zTz/U/8");
    }

    @Test
    void testGenerateToken() {
        // Arrange
        Authentication authentication = Mockito.mock(Authentication.class);
        Mockito.when(authentication.getName()).thenReturn("testUser");

        // Act
        String token = jwtTokenProvider.generateToken(authentication);

        // Assert
        Assertions.assertNotNull(token);
    }

    @Test
    void testGetUsername() {
        // Arrange
        Authentication authentication = Mockito.mock(Authentication.class);
        Mockito.when(authentication.getName()).thenReturn("testUser");

        String token = jwtTokenProvider.generateToken(authentication);

        // Act
        String username = jwtTokenProvider.getUsername(token);

        // Assert
        Assertions.assertEquals("testUser", username);
    }

    @Test
    void testValidateToken() {
        // Arrange
        Authentication authentication = Mockito.mock(Authentication.class);
        Mockito.when(authentication.getName()).thenReturn("testUser");

        String token = jwtTokenProvider.generateToken(authentication);

        // Act
        boolean isValid = jwtTokenProvider.validateToken(token);

        // Assert
        Assertions.assertTrue(isValid);
    }
}
