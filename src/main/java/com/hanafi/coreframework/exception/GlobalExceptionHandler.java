package com.hanafi.coreframework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//     Handle specific exceptions
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ApiError> handleResourceNotFoundException(
//            ResourceNotFoundException ex, WebRequest request) {
//        ApiError error = new ApiError(
//                HttpStatus.NOT_FOUND.value(),
//                ex.getMessage(),
//                request.getDescription(false).replace("uri=", ""));
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }

    // Handle generic exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGlobalException(Exception ex, WebRequest request) {
        ApiError error = new ApiError(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage(),
                request.getDescription(false).replace("uri=", ""));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}