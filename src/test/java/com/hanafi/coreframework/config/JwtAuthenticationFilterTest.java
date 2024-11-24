package com.hanafi.coreframework.config;

import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JwtAuthenticationFilterTest {

    final String TOKEN = "eyJhbGciOiJIUzI14iJ9.eyJzdWIiOif5dVBl3l91c2Vy3iwiaWF2IjoxN1MyMzE9NTg8LC6le5AiO3E32zI1MjAxD5R9.vzd2EhRK8D1c977AYGAUhMh-rT98flxCYNvjgtwT6vW";
    final String HEADER = "Bearer " + TOKEN;

    @InjectMocks
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    @Test
    void getTokenFromRequest_ValidTokenInRequestHeader_ReturnToken() {

        // Arrange
        HttpServletRequest httpServletRequest = Mockito.mock(HttpServletRequest.class);
        Mockito.when(httpServletRequest.getHeader("Authorization")).thenReturn(HEADER);

        // Act
        String tokenFromRequest = jwtAuthenticationFilter.getTokenFromRequest(httpServletRequest);

        // Assert
        Assertions.assertEquals(TOKEN, tokenFromRequest);
    }

    @Test
    void getTokenFromRequest_EmptyTokenInRequestHeader_ReturnNull() {

        // Arrange
        HttpServletRequest httpServletRequest = Mockito.mock(HttpServletRequest.class);
        Mockito.when(httpServletRequest.getHeader("Authorization")).thenReturn("");

        // Act
        String tokenFromRequest = jwtAuthenticationFilter.getTokenFromRequest(httpServletRequest);

        // Assert
        Assertions.assertNull(tokenFromRequest);
    }

    @Test
    void getTokenFromRequest_TokenWithNoBearerInRequestHeader_ReturnNull() {

        // Arrange
        HttpServletRequest httpServletRequest = Mockito.mock(HttpServletRequest.class);
        Mockito.when(httpServletRequest.getHeader("Authorization")).thenReturn(TOKEN);

        // Act
        String tokenFromRequest = jwtAuthenticationFilter.getTokenFromRequest(httpServletRequest);

        // Assert
        Assertions.assertNull(tokenFromRequest);
    }
}
