package com.uth.ums.enrollment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    protected ResponseEntity<ErrorResponse> handleGlobalException(GlobalException globalException) {
        return ResponseEntity
                .badRequest()
                .body(ErrorResponse.builder()
                        .code(globalException.getCode())
                        .message(globalException.getMessage())
                        .build());
    }

    @ExceptionHandler({Exception.class})
    protected ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity
                .badRequest()
                .body("Exception occur inside API " + e);
    }

}
