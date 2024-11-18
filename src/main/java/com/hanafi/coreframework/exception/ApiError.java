package com.hanafi.coreframework.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {

    private int status;
    private String message;
    private LocalDateTime timestamp;
    private String path;

    public ApiError(int status, String message, String path) {
        this.status = status;
        this.message = message;
        this.timestamp = java.time.LocalDateTime.now();
        this.path = path;
    }

}